package com.company;

import Product.Product;
import ProductManager.ProductManager;

import java.util.ArrayList;

public class TestProductManager {

    public static void main(String[] args) {
	// write your code here
        Product product1 = new Product(1,"máy giặt",9800000);
        Product product2 = new Product(2,"Tivi",15000000);
        Product product3 = new Product(3,"tủ lạnh",20000000);
        Product product4 = new Product(4,"điều hòa",15000000);
        Product product5 = new Product(5,"bình nóng",10500000);
        ArrayList<Product> productList = new ArrayList<>();
        ProductManager Pro = new ProductManager(productList);
        Pro.add(product1);
        Pro.add(product2);
        Pro.add(product3);
        Pro.add(product4);
        Pro.add(product5);
        Pro.disPlayProduct();
        System.out.println("---------------remove id");
        Pro.remove(4);
        Pro.disPlayProduct();
        System.out.println("---------------edit id,name");
        Pro.editProduct(1,"máy giặt samsung");
        Pro.disPlayProduct();
        System.out.println("---------------search");
        System.out.println(Pro.searchProduct("tivi"));
        System.out.println("---------------sắp xếp theo giá");
        Pro.sort();
        Pro.disPlayProduct();


    }
}
