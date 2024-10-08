package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс потока групп студентов
 * Имплементирует интерфейс Iterable
 * Для перебора групп
 */
public class StudentSteam<T extends Comparable<T>, V> implements Iterable<StudentGroup<T,V>> {

    /**
     * Поля
     */

    // идентификатор потока
    private V id;

    // список групп в потоке
    private List<StudentGroup<T, V>> studentSteam;

    /**
     * Конструктор
     * @param listStudentGroups
     */
    public StudentSteam(List<StudentGroup<T, V>> listStudentGroups, V id) {
        this.studentSteam = listStudentGroups;
        this.id = id;
    }

    /**
     * Геттеры и сеттеры
     * @return
     */

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }

    public List<StudentGroup<T, V>> getListStudentGroups() {
        return studentSteam;
    }

    public void setListStudentGroups(List<StudentGroup<T, V>> listStudentGroups) {
        this.studentSteam = listStudentGroups;
    }

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "StudentSteam: " +
                "id=" + id + " amount groups=" + studentSteam.size() +
                " studentSteam: " + " \n" + studentSteam +
                '}';
    }

    /**
     * Переопределение метода iterator
     * для перебора групп студентов
     * @return
     */
    @Override
    public Iterator<StudentGroup<T, V>> iterator() {
        return new GroupIterator(studentSteam);
    }
}
