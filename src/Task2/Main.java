package Task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Apple apple = new Apple();
        Field field = apple.getClass().getDeclaredField("color");
        field.setAccessible(true);

        try {
            field.set(apple, "green");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(apple.getColor());
    }
}
