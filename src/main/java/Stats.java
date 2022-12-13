import java.util.ArrayList;

public class Stats {
    private String strength;
    private String magic;
    private String endurance;
    private String agility;
    private String luck;

    private ArrayList<Demons> demons;

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public String getEndurance() {
        return endurance;
    }

    public void setEndurance(String endurance) {
        this.endurance = endurance;
    }

    public String getAgility() {
        return agility;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public String getLuck() {
        return luck;
    }

    public void setLuck(String luck) {
        this.luck = luck;
    }

    public ArrayList<Demons> getDemons() {
        return demons;
    }

    public void setDemons(ArrayList<Demons> demons) {
        this.demons = demons;
    }

    public Stats(String strength,String magic,String endurance,String agility,String luck){
        this.strength=strength;
        this.magic=magic;
        this.endurance=endurance;
        this.agility=agility;
        this.luck=luck;
    }
}
