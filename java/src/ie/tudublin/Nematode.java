package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode  extends PApplet{

    private String name;
    private int lenght;
    private boolean limbs;
    private String gender;
    private boolean eyes;


    public Nematode(TableRow tr)
    {
        this(tr.getString("name"), 
            tr.getInt("lenght"), 
            tr.getInt("limbs") == 1, 
            tr.getString("gender"), 
            tr.getInt("eyes") == 1);
    }
    
    public Nematode(String name, int lenght, boolean limbs, String gender, boolean eyes) {
        this.name = name;
        this.lenght = lenght;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }
    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", lenght=" + lenght + ", limbs=" + limbs + ", name="
                + name + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLenght() {
        return lenght;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public boolean isLimbs() {
        return limbs;
    }
    public void setLimbs(boolean limbs) {
        this.limbs = limbs;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }
    
}
