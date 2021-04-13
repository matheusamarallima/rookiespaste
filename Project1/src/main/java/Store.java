import entity.Product;
import service.ProductService;

import java.util.Scanner;

public class Store {
    public static ProductService productService = new ProductService();
    static Scanner scan = new Scanner(System.in);
    static Product product = new Product();
    public static void main(String[] args) {
        showMenu();
        int option = Integer.parseInt(scan.nextLine());
        switch (option){
            case 1:
                productService.saveProduct(createProduct());
                System.out.println(product);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    public static void showMenu(){
        System.out.println("Choose an option");
        System.out.println("1- Create Product");
        System.out.println("2- List all product");
        System.out.println("3- Search by name");
        System.out.println("4- Exit");
    }

    public static Product createProduct(){

        System.out.println("name product");
        product.setName(scan.nextLine());

        System.out.println("price product");
        product.setPrice(Double.parseDouble(scan.nextLine()));

        System.out.println("description product");
        product.setDescription(scan.nextLine());

        System.out.println("quantity product");
        product.setQuantity(Integer.parseInt(scan.nextLine()));

        System.out.println("category product");
        product.setCategory(scan.nextLine());

        return product;
    }
}
