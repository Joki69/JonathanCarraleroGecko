import java.util.ArrayList;

public class Arcana {
    private String arcanaName;
    private ArrayList<Arcana> compedium;
    private ArrayList<Demons> demons= new ArrayList<>();

    public String getArcanaName() {
        return arcanaName;
    }

    public void setArcanaName(String arcanaName) {
        this.arcanaName = arcanaName;
    }

    public ArrayList<Arcana> getCompedium() {
        return compedium;
    }

    public void setCompedium(ArrayList<Arcana> compedium) {
        this.compedium = compedium;
    }

    public ArrayList<Demons> getDemons() {
        return demons;
    }

    public void setDemons(ArrayList<Demons> demons) {
        this.demons = demons;
    }

    public Arcana(String arcanaName){
        this.arcanaName=arcanaName;
    }
}
