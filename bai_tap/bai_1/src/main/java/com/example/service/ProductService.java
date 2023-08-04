package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private List<Product> list = new ArrayList<>();

    public ProductService() {
        list.add(new Product(1, "Áo Khoác", "Đây là mô tả Áo Khoác", 1200));
        list.add(new Product(2, "Quần Đũi", "Đây là mô tả Quần Đũi", 1300));
        list.add(new Product(3, "Giày Da", "Đây là mô tả Giày Da", 1800));
        list.add(new Product(4, "Mũ Cối", "Đây là mô tả Mũ Cối", 9999));
    }

    public List<Product> getList() {
        return list;
    }

    public void save(Product product) {
        if (findById(product.getId()) == null) {
            list.add(product);
        } else {
            list.set(list.indexOf(findById(product.getId())), product);
        }
    }

    public void delete(int id) {
        list.remove(findById(id));
    }

    public Product findById(int id) {
        for (Product p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public int getNewId() {
        int idMax = 0;
        for (Product p : list) {
            if (p.getId() > idMax) {
                idMax = p.getId();
            }
        }
        return idMax + 1;
    }

    public void sort(String action) {
        switch (action) {
            case "STT":
                list.sort(Comparator.comparingInt(Product::getId));
                break;
            case "NAME":
                list.sort(Comparator.comparing(Product::getName).reversed());
                break;
            case "PRICE":
                list.sort(Comparator.comparingDouble(Product::getPrice));
                break;
            default:
                break;
        }
    }
}
