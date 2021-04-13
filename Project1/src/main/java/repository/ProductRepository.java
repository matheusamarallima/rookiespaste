package repository;

import entity.Product;

public interface ProductRepository {
    void saveProduct(Product product);
    void listAllProducts();
    void searchByName();
}