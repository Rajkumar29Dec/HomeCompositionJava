package altimetrik.raj;

public class WoodenProducts {
    String ProductName;
    String Brand;
    int yearsOfWorking;
    int model;

    public WoodenProducts(String productName, String brand, int yearsOfWorking, int model) {
        ProductName = productName;
        Brand = brand;
        this.yearsOfWorking = yearsOfWorking;
        this.model = model;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getBrand() {
        return Brand;
    }

    public int getYearsOfWorking() {
        return yearsOfWorking;
    }

    public int getModel() {
        return model;
    }
}
