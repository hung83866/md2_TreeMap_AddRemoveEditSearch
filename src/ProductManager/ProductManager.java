package ProductManager;

import Product.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> productArrayList = new ArrayList<Product>();

    public ProductManager(ArrayList<Product> pro) {
        this.productArrayList = pro;
    }

    public void add(Product newProduct) {
        productArrayList.add(newProduct);
    }

    public void remove(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.remove(productArrayList.get(i));
            }
        }
    }

    public void disPlayProduct() {
        System.out.println(productArrayList);
    }

    public void editProduct(int id, String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.get(i).setName(name);
            }
        }
    }

    public String searchProduct(String name) {
        for (Product product : productArrayList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return "Product = " + product;
            }
        }
        return "không tồn tại!";
    }

    public void sort() {
        Collections.sort(this.productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }
}
