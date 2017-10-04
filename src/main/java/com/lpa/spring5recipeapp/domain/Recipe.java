package com.lpa.spring5recipeapp.domain;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

// add getters and setters, equals and hashcode
@Data
public class Recipe {

    private String id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Byte[] image;
    private Difficulty difficulty;
    private Set<Ingredient> ingredients = new HashSet<>();
    private Notes notes;
    private Set<Category> categories = new HashSet<>();


    public void setNotes(Notes notes) {
        // bidirectional relationship
        this.notes = notes;
        if(notes != null) {
            notes.setRecipe(this);
        }
    }

    public Recipe addIngredient(Ingredient ingredient) {
        // bidirectional relationship
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }
}
