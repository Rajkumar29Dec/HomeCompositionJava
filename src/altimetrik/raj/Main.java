package altimetrik.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WoodenProducts woodenProducts=new WoodenProducts("door","M3R",5,2020);
        System.out.println("Product is"+woodenProducts.getProductName()
        +"working for "+ woodenProducts.getYearsOfWorking()+"Years" +
                "and it is from "+ woodenProducts.getModel()+"model");
        Warranty warranty=new Warranty(5,"M3R",woodenProducts);
        System.out.println("Brand"+woodenProducts.getBrand()+
                "and warranty for"+warranty.YearsOfWarranty
        );
        HouseSingleRoom houseSingleRoom=new HouseSingleRoom(woodenProducts,warranty);
        System.out.println("House contains "+woodenProducts.ProductName+"it has "+warranty.YearsOfWarranty+"Years"
        +"of brand"+woodenProducts.Brand+"it is already working for"+woodenProducts.yearsOfWorking
        +"it is "+woodenProducts.model+"Year Model");
    }
}
