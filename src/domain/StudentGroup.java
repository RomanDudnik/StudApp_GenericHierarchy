package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс группы студентов
 * Имплементирует интерфейс Iterable
 * Для перебора студентов (делаем класс итерируемым)
 */
public class StudentGroup<T extends Comparable<T>, V> implements Iterable<Student<T, V>>, Comparable<StudentGroup<T, V>> {

    /**
     * Поля
     */

    // Список студентов
    private List<Student<T, V>> listStudents;
    // Идентификатор
    private V id;

    /**
     * Конструктор
     * @param listStudents
     * @param id
     */
    public StudentGroup(List<Student<T, V>> listStudents, V id) {
        this.listStudents = listStudents;
        this.id = id;
    }

    /**
     * Геттеры и сеттеры
     * @return
     */

    public List<Student<T, V>> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student<T, V>> listStudents) {
        this.listStudents = listStudents;
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "StudentGroup: " +
                "id=" + id +
                " amount students=" + listStudents.size() + " \n" +
                " listStudents: " + " \n" + listStudents +
                '}' + "\n";
    }

    /**
     * Переопределение метода iterator
     * для перебора студентов
     * @return
     */
    @Override
    public Iterator<Student<T, V>> iterator() {
        return new StudentIterator<T, V>(listStudents);
    }

    /**
     * Переопределение метода compareTo
     * Сортировка по количеству студентов в группе
     * затем по идентификатору
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(StudentGroup<T, V> o) {
//        return Integer.compare(this.listStudents.size(), o.listStudents.size());

        // Сортировка по количеству студентов
        if (o.listStudents.size() > this.listStudents.size()) {
            return -1;
        }

        if (o.listStudents.size() < this.listStudents.size()) {
            return 1;
        }
        return 0;

//        // Сортировка по идентификатору, в случае иерархии основанной на Generic классах, невозможна без Cast
//        return Integer.compare(this.getId(), o.getId());
    }
}
