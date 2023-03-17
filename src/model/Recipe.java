package model;

import java.util.ArrayList;

public class Recipe {

    private Ingredient ingredient;

    private ArrayList<Ingredient> ingredients;

    public Recipe() {
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient n){
        Ingredient ingredient1 = null;
        for(int i = 0; i < ingredients.size(); i++){
            Ingredient ing = ingredients.get(i);
            if(ing.getName().equals(n.getName())){
                ingredient1 = ing;
            }
        }
        if(ingredient1 != null){
            ingredient1.addWeightIngredient(n.getWeight());
        }else{
            ingredients.add(n);
        }

    }
    public int getSize(){
        return ingredients.size();
    }
    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
