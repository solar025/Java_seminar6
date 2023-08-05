package Task1;
public class Notebook {
    private String brand;
    private String model;
    private String OS;
    private int ram;
    private int hdSize;
    public Notebook(String brand, String model, String OS, int ram, int hdSize) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.ram = ram;
        this.hdSize = hdSize;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getOS() {
        return OS;
    }
    public int getRam() {
        return ram;
    }
    public int getHdSize() {
        return hdSize;
    }
}