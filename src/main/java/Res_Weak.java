import java.util.ArrayList;

public class Res_Weak {
    private String inherit;
    private String reflects;
    private String absorbs;
    private String block;
    private String resists;
    private String weak;

    private ArrayList<Demons> demons;

    public String getInherit() {
        return inherit;
    }

    public void setInherit(String inherit) {
        this.inherit = inherit;
    }

    public String getReflects() {
        return reflects;
    }

    public void setReflects(String reflects) {
        this.reflects = reflects;
    }

    public String getAbsorbs() {
        return absorbs;
    }

    public void setAbsorbs(String absorbs) {
        this.absorbs = absorbs;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getResists() {
        return resists;
    }

    public void setResists(String resists) {
        this.resists = resists;
    }

    public String getWeak() {
        return weak;
    }

    public void setWeak(String weak) {
        this.weak = weak;
    }

    public ArrayList<Demons> getDemons() {
        return demons;
    }

    public void setDemons(ArrayList<Demons> demons) {
        this.demons = demons;
    }

    public Res_Weak(String inherit,String reflects,String absorbs,String block,String resists,String weak){
        this.inherit=inherit;
        this.reflects=reflects;
        this.absorbs=absorbs;
        this.block=block;
        this.resists=resists;
        this.weak=weak;
    }
}
