package com.lpa.spring5recipeapp.domain;

import lombok.Data;

@Data
public class Notes {
    private String id;
    private String recipeNotes;
    private Recipe recipe;
}
