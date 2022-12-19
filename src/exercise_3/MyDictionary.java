package exercise_3;


/**
 * Завдання 3
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні
 * можливість використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен
 * включати метод додавання пар елементів, індексатор для отримання значення елемента за вказаним індексом і
 * властивість тільки для читання для отримання загальної кількості пар елементів.
 */
public class MyDictionary <TKey, TValue> {

    private final TKey key;
    private final TValue value;

    public MyDictionary(TKey key, TValue value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}
