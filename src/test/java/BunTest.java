import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getNameTest() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3", 988);
        assertEquals("Метод должен возвращать строку Флюоресцентная булка R2-D3", "Флюоресцентная булка R2-D3", bun.getName());
    }

    @Test
    public void getPriceTest() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3", 988);
        //assertEquals("Метод должен возвращать цену 988", 988, 0, bun.getPrice());
        assertEquals("Метод должен возвращать цену 988",988, bun.getPrice(), 0);
    }

}