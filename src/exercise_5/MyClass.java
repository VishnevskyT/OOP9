package exercise_5;

/**
 * Завдання 5
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyClass, що містить статичний фабричний
 * метод - T factoryMethod(), який породжуватиме екземпляри типу, зазначеного як параметр типу
 * (покажчика місця заповнення типом – Т).
 */
public class MyClass <T> {
    private T data;

    public MyClass(T data) {
        this.data = data;
    }

    public MyClass() {
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> MyClass<T> factoryMethodWitData(T data){
        return new MyClass<>(data);
    }

    public static <T> MyClass<T> factoryMethodWithoutData(){
        return new MyClass<>();
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "data=" + data +
                '}';
    }

}
