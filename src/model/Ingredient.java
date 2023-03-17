package model;

import exceptions.InvalidNumberException;

public class Ingredient {

    private String name;
    private int weight;

    public Ingredient(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void addWeightIngredient(int w) throws InvalidNumberException {
        if(w > 0){
            weight += w;
        }else{
            throw new InvalidNumberException();
        }
    }


    public void removeWeightIngredient(int w) throws InvalidNumberException{
        if(w > 0){
            weight -= w;
        }else {
            throw new InvalidNumberException();
        }
    }
}
