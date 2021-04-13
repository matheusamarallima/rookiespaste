package service;

import entity.Product;
import repository.ProductRepository;

import java.util.HashMap;
import java.util.Map;

public class ProductService implements ProductRepository {
    private Map<String,Product> listProducts;

    public ProductService(Map<String, Product> listProducts) {
        this.listProducts = listProducts;
    }
    public ProductService() {
        this.listProducts = new HashMap<String, Product>();
    }

    public void saveProduct(Product product) {
        this.listProducts.put(product.getName(),product);
        System.out.println("entrou");
    }

    public void listAllProducts() {

    }

    public void searchByName() {

    }
}