package altimetrik.raj;

public class Warranty {
    int YearsOfWarranty;
    String brandName;
    WoodenProducts door;

    public Warranty(int yearsOfWarranty, String brandName, WoodenProducts door) {
        YearsOfWarranty = yearsOfWarranty;
        this.brandName = brandName;
        this.door = door;
    }

    public int getYearsOfWarranty() {
        return YearsOfWarranty;
    }

    public String getBrandName() {
        return brandName;
    }
}
