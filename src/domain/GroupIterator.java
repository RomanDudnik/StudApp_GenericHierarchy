package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс итератора для перебора групп студентов. Имплементирует интерфейс Iterator *
 */
public class GroupIterator<T extends Comparable<T>, V> implements Iterator<StudentGroup<T, V>> {

    /**
     * Поля
     * для реализации итератора
     */
    // Счетчик (внутреннее поле)
    private int count;
    // Итерируемый список групп студентов
    private List<StudentGroup<T, V>> listStudentGroups;

    /**
     * Конструктор
     * @param listStudentGroups
     */
    public GroupIterator(List<StudentGroup<T, V>> listStudentGroups) {
        this.listStudentGroups = listStudentGroups;
    }

    /**
     * Переопределение метода hasNext
     * @return
     */
    @Override
    public boolean hasNext() {
        // Проверка наличия следующего элемента в списке
        return count < listStudentGroups.size();
    }

    /**
     * Переопределение метода next
     * @return
     */
    @Override
    public StudentGroup<T, V> next() {
        // Переход к следующему элементу
        return listStudentGroups.get(count++);
    }
}
