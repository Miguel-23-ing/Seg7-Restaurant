package model;

import java.util.ArrayList;

public class Recipe {

    private Ingredient ingredient;

    private ArrayList<Ingredient> ingredients;

    public Recipe() {
        ingredients = new ArrayList<>();
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
