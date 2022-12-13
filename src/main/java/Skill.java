import java.util.ArrayList;

public class Skill {
    private String skillName;
    private String skillCost;
    private String skillLevel;
    private String skillEffect;

    private ArrayList<Demons> demons;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillCost() {
        return skillCost;
    }

    public void setSkillCost(String skillCost) {
        this.skillCost = skillCost;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getSkillEffect() {
        return skillEffect;
    }

    public void setSkillEffect(String skillEffect) {
        this.skillEffect = skillEffect;
    }

    public ArrayList<Demons> getDemons() {
        return demons;
    }

    public void setDemons(ArrayList<Demons> demons) {
        this.demons = demons;
    }

    public Skill(String skillName,String skillCost,String skillLevel,String skillEffect){
        this.skillName=skillName;
        this.skillCost=skillCost;
        this.skillLevel=skillLevel;
        this.skillEffect=skillEffect;
    }
}
