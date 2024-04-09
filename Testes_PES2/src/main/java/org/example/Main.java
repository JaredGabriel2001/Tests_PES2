package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Main {
    class Dollar {
        int amount = 10;
        Dollar(int amount) {}
        void times(int multiplier) {}
    }

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
    public static void main(String[] args) {

    }
}
