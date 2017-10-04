package com.lpa.spring5recipeapp.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Ingredient {

    private String id;
    private String description;
    private BigDecimal amount;
    private Recipe recipe;
    private UnitOfMeasure unitOfMeasure;


    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = uom;
    }

    public Ingredient(String description, BigDecimal amount, Recipe recipe, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.recipe = recipe;
        this.unitOfMeasure = uom;
    }

}
