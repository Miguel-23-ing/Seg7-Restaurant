package model;

import exceptions.InvalidNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    private Ingredient ing;

    public void setUp1(){
        ing = new Ingredient("Tomate", 245);
    }

    @Test
    public void weightAddedSuccessfullyTest(){
        //Arrange
        setUp1();
        //Act
        ing.addWeightIngredient(54);
        //Assert
        assertEquals(ing.getWeight(), 299);
    }

    @Test
    public void addNegativeWeightSuccessfullyInterruptedTest(){
        setUp1();
        assertThrows(InvalidNumberException.class, ()-> ing.addWeightIngredient(-100));
    }

    @Test
    public void weightRemovedSuccessfullyTest(){
        setUp1();
        ing.removeWeightIngredient(45);
        assertEquals(ing.getWeight(), 200);
    }

    @Test
    public void removeNegativeWeightSuccessfullyInterrumpedTes(){
        setUp1();
        assertThrows(InvalidNumberException.class, ()-> ing.removeWeightIngredient(-100));
    }

}
