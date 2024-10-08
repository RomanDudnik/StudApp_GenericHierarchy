package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс итератора
 * Для методов перебора
 * hasNext() и next()
 */
public class StudentIterator<T extends Comparable<T>, V> implements Iterator<Student<T, V>> {


    /**
     * Поля
     * для реализации итератора
     */

    // Счетчик (внутренняя переменная)
    private int count;

    // Итерируемый список
    private List<Student<T, V>> listStudents;

    /**
     * Конструктор
     * для получения итерируемого списка
     * @param listStudents
     */
    public StudentIterator(List<Student<T, V>> listStudents) {
        this.listStudents = listStudents;
    }

    /**
     * Переопределение метода hasNext
     * @return
     */
    @Override
    public boolean hasNext() {
        // Проверка наличия следующего элемента
        return count < listStudents.size();
    }

    /**
     * Переопределение метода next
     * @return
     */
    @Override
    public Student<T, V> next() {
        // Переход к следующему элементу
        return listStudents.get(count++);
    }
}
