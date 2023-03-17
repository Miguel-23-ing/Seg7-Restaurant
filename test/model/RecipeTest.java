package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private Recipe rec;

    public void setUp1(){
        rec = new Recipe();
    }

    public void setUp2(){
        Ingredient ingredient1 = new Ingredient("Cebolla", 315);
        Ingredient ingredient2 = new Ingredient("Ajo", 58);
        Ingredient ingredient3 = new Ingredient("Arroz", 520);
    }
    @Test
    public void ingredienteAddedToReceipeSuccessfullyTest(){
        setUp1();
        rec.addIngredient(new Ingredient("Sal", 12));
        assertEquals(rec.getSize(), 1);
    }



}
