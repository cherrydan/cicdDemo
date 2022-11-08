import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    static Animal animal;

    @BeforeAll
    public static void init() {
        animal = new Animal();
    }

    @Test
    public void testEat() {

        animal.eat();
        Assertions.assertFalse(animal.hungry);
    }

    @Test
    public void testOld() {
        animal.age = 2;
        animal.stateOlder();
        Assertions.assertEquals(animal.age, 3);
    }
}
