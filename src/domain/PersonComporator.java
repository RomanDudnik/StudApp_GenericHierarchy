package domain;

import java.lang.reflect.Method;
import java.util.Comparator;

/**
 * Класс компоратора (обобщенных типов)
 * Для сравнения всех сущностей типа Person
 * обобщенный компоратор
 * @param <T>
 */

public class PersonComporator<T extends Person<T, V>, V extends Comparable<V>> implements Comparator<T> {
    /**
     * Используем getMethod("getName") для получения метода getName() по имени метода,
     * а затем вызываем этот метод на объектах o1 и o2 с помощью method.invoke().
     * Это позволяет нам сравнивать имена объектов типа T, не зависимо от конкретного типа T,
     * который используется в программе.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(T o1, T o2) {
        // Метод getClass() для получения класса объекта типа T
        // Для последующего вызова метода getName() на этом классе
        Class<?> clazz = o1.getClass();
        try {
            Method method = clazz.getMethod("getName");
            String name1 = (String) method.invoke(o1);
            String name2 = (String) method.invoke(o2);
            return name1.compareTo(name2);
        } catch (Exception e) {
            throw new RuntimeException("Error comparing names", e);
        }
    }
}
