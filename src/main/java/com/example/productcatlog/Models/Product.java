package com.example.productcatlog.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{

    private String name;
    private String description;
    private Double price;
    private String ImageUrl;
    private Category category;
}
