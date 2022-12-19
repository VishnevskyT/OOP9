package exercise_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyClass<String> myClass = MyClass.factoryMethodWitData("ABC");
        MyClass<Integer> myClass1 = MyClass.factoryMethodWitData(55);
        MyClass<Double> myClass2 = MyClass.factoryMethodWithoutData();

        myClass2.setData(33.33);
        System.out.println(myClass);
        System.out.println(myClass1);
        System.out.println(myClass2);

        List<MyClass<String>> list = new ArrayList<>();
        list.add(MyClass.factoryMethodWitData("ZYX"));
        list.add(MyClass.factoryMethodWitData("YZX"));
        list.add(MyClass.factoryMethodWitData("XYZ"));
        list.add(MyClass.factoryMethodWitData("ZXY"));
        list.add(MyClass.factoryMethodWitData("YXZ"));
        list.add(MyClass.factoryMethodWitData("XZY"));

        System.out.println(Arrays.toString(list.toArray()));



    }
}
