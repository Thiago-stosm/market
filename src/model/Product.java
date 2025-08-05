package model;
import testes.IdGenerator;

import java.math.*;
public class Product{

    private final Integer id;
    private String name;
    private String producer;
    private String description;
    private String category;
    private BigDecimal price;
    private Integer storage;

    public Product(String name, String producer, String description, String category, BigDecimal price){
        this.id = IdGenerator.generateId();
        this.name = name;
        this.producer = producer;
        this.description = description;
        this.category = category;
        this.price = price;
    }


}
