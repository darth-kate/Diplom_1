import org.junit.Test;
import praktikum.Bun;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    @Test
    public void getNameTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Флюоресцентная булка R2-D3", 988);
        assertEquals("Метод должен возвращать строку Флюоресцентная булка R2-D3", "Флюоресцентная булка R2-D3", ingredient.getName());
    }

    @Test
    public void getPriceTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Флюоресцентная булка R2-D3", 988);
        assertEquals("Метод должен возвращать цену 988", 988, ingredient.getPrice(), 0);
    }

    @Test
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Флюоресцентная булка R2-D3", 988);
        assertEquals("Метод должен возвращать тип Соус", IngredientType.SAUCE, ingredient.getType());
    }
}
