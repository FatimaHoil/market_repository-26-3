package com.tecnm.merida.marketbackendv2263.domain;


import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getALl();
    Optional<List<Product>>getByCategory(int categoryId);
    Optional<Product> getScarceProducts(int quantity);
    Product save (Product product);
    Product delete(Product product);

}
