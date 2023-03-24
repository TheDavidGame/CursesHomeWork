package proModule.home3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
//        ex1, 2
//        Class<?> clazzWithIsLike = ClassWithIsLike.class;
//        Class<?> ClassWithoutIsLike = ClassWithoutIsLike.class;
//        ClassDescriptionInterface classDescriptionInterface = new ClassDescriptionInterface();
//        classDescriptionInterface.checkInterface(clazzWithIsLike);
//        classDescriptionInterface.checkInterface(ClassWithoutIsLike);

//        ex3
//        APrinter aPrinter = new APrinter();
//        try {
//            Method method = APrinter.class.getMethod("print", int.class);
//            method.invoke(aPrinter, 1, 2);
//        } catch (NoSuchMethodException e) {
//            System.out.println("Метод не найден: " + e.getMessage());
//        } catch (IllegalAccessException e) {
//            System.out.println("Отказано в доступе к методу: " + e.getMessage());
//        } catch (InvocationTargetException e) {
//            System.out.println("Исключение при вызове метода: " + e.getCause().getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println("Некорректное значение: " + e.getMessage());
//        }

//        ex4
        List<Class<?>> interfaces = InterfaceSearch(D.class);
        for (Class<?> clazz : interfaces) {
            System.out.println(clazz.getName());
        }
    }

    public static List<Class<?>> InterfaceSearch(Class<?> clazz) {
        List<Class<?>> interfaces = new ArrayList<>();
        while (clazz != Object.class) {
            interfaces.addAll(Arrays.asList(clazz.getInterfaces()));
            clazz = clazz.getSuperclass();
        }
        return interfaces;
    }

    interface A {
    }

    interface B {
    }

    class C implements B {
    }

    class D extends C implements A {
    }
}
