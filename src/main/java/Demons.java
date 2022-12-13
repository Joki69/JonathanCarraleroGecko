import java.util.ArrayList;

public class Demons {
    private String name;
    private String history;
    private String level;
    private String arcana;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getArcana() {
        return arcana;
    }

    public void setArcana(String arcana) {
        this.arcana = arcana;
    }
    private ArrayList<Demons> demons;
    private ArrayList<Skill> skills= new ArrayList<>();
    private ArrayList<Stats> stats= new ArrayList<>();
    private ArrayList<Res_Weak> res_weaks= new ArrayList<>();
    public Demons(String name, String history){
        this.name= name;
        this.history=history;

    }
}
