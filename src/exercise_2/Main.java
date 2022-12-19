package exercise_2;

import java.util.Arrays;

/**
 * Завдання 2
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість
 * використання його екземпляра аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з
 * екземпляром повинен включати метод додавання елемента, індексатор для отримання значення елемента за
 * вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.
 */

public class Main {
    public static void main(String[] args) {
        MyList<MyList<String>> myList = new MyList<>();

        myList.add("Cat");
        myList.add("Dog");
        myList.add("Guinea pig");

        System.out.println("My favorite pet: " + myList.getItem(2));
        System.out.println("Residents of my Zoo: " + Arrays.toString(myList.getItems()));

    }
}
