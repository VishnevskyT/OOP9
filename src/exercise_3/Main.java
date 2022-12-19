package exercise_3;

import java.util.HashMap;
import java.util.Map;

/**
 * Завдання 3
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні
 * можливість використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен
 * включати метод додавання пар елементів, індексатор для отримання значення елемента за вказаним індексом і
 * властивість тільки для читання для отримання загальної кількості пар елементів.
 */

public class Main {
    public static void main(String[] args) {


        Map<Integer, MyDictionary<String, String>> dictionary = new HashMap<>();
        dictionary.put(1, new MyDictionary<>("accordion", "акордеон"));
        dictionary.put(2, new MyDictionary<>("arioso", "аріозо"));
        dictionary.put(3, new MyDictionary<>("finger-board", "гриф"));
        dictionary.put(4, new MyDictionary<>("idiofoni", "ідіофони"));
        dictionary.put(5, new MyDictionary<>("libretto", "лібрето"));

        System.out.println("Отримання значення елементу за індексом (1): " + dictionary.get(1));
        System.out.println("Отримання загальної кількості пар елементів: " + dictionary.values());

    }

}
