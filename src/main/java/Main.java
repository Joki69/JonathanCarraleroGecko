import au.com.bytecode.opencsv.CSVWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("HOME"));
        //  System.out.println(System.getenv(""));
        ArrayList<Arcana> arrayArcanas = new ArrayList<>();
        ArrayList<Demons> arrayList=new ArrayList<>();
        Arcana arcana = new Arcana("");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        // File pathBinary = new File("src/main/resources/firefox");
        //  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        // DesiredCapabilities desired = new DesiredCapabilities();
        FirefoxOptions options = new FirefoxOptions();
        // desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
        ArrayList<String> listaDeArcana = new ArrayList<>();
        ArrayList<String> linksDemonios = new ArrayList<>();
        ArrayList<String> arrayName = new ArrayList<>();
        ArrayList<String> arrayHistoria = new ArrayList<>();
        WebDriver driver = new FirefoxDriver(options);
        String text = "";
        String baseUrl = "https://megamitensei.fandom.com/wiki/List_of_Persona_5_Personas#Fool";
        driver.get(baseUrl);

        driver.findElement(By.className("NN0_TB_DIsNmMHgJWgT7U")).click();
        try {
            List<WebElement> tablas = driver.findElements(By.className("table"));
            List<WebElement> arcanas = driver.findElements(By.className("mw-headline"));


            int contadorTablas = 0;
            for (WebElement tabla : tablas) {

                List<WebElement> tablaTds = tabla.findElements(By.tagName("td"));

                for (WebElement td : tablaTds) {
                    listaDeArcana.add(arcanas.get(contadorTablas).findElement(By.tagName("a")).getText());
                    linksDemonios.add(td.findElement(By.tagName("a")).getAttribute("href"));

                }
                contadorTablas++;

                if (contadorTablas == 21) {
                    System.out.println("Entra");
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println(linksDemonios.size() + " + " +  listaDeArcana.size());

        for (int i = 0; i < 3; i++) {
                driver.get(linksDemonios.get(i));
                WebElement titulo = driver.findElement(By.className("page-header__title-wrapper"));
                WebElement historia = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/main/div[3]/div[2]/div/p[4]"));
                arrayName.add(titulo.findElement(By.tagName("h1")).getText());
                arrayHistoria.add(historia.getText());
                System.out.println(historia.getText());
                System.out.println(titulo.findElement(By.tagName("h1")).getText());
            }
        ArrayList <String []> arrayDemonios= new ArrayList<>();
        String[] header ={"Arcana","Name", "History"};
        arrayDemonios.add(header);
        for (int i = 0; i < 3; i++) {
            String [] demonios= new String[3];
            demonios[0]=listaDeArcana.get(i);
            demonios[1]=arrayName.get(i);
            demonios[2]=arrayHistoria.get(i);
            arrayDemonios.add(demonios);
        }

        CsvOutput(arrayDemonios);


        }
        public static void CsvOutput(ArrayList lista){
        StringWriter writer = new StringWriter();
        try{
            CSVWriter csvWriter = new CSVWriter( new OutputStreamWriter(new FileOutputStream("Demonios.csv"), StandardCharsets.UTF_8),
                    ',',
                    CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END
            );
            csvWriter.writeAll(lista);
            csvWriter.close();
            System.out.println(writer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }




