package exercise_2;

import java.awt.*;

/**
 * Завдання 2
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість
 * використання його екземпляра аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з
 * екземпляром повинен включати метод додавання елемента, індексатор для отримання значення елемента за
 * вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.
 */

public class MyList <T> extends List {

    T field;

    public MyList(T field) throws HeadlessException {
        this.field = field;
    }

    public MyList() throws HeadlessException {

    }

    @Override
    public void add(String item) {
        super.add(item);
    }

    @Override
    public String getItem(int index) {
        return super.getItem(index);
    }

    @Override
    public synchronized String[] getItems() {
        return super.getItems();
    }
}
