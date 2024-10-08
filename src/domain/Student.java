package domain;

/**
 * Класс студент
 * Имплементирует интерфейс Comparable
 * Для сортировки студентов
 */
public class Student<T extends Comparable<T>, V> extends Person<T, V> implements Comparable<Student<T, V>> {

    /**
     * Поля
     */
    // Поле идентификатора
    private V id;
    // Статическое поле присваивания идентификатора
    static int generalId;

    /**
     * Конструктор
     * @param name
     * @param age
     */
    public Student(T name, V age) {
        super(name, age);
//        this.id = generalId;
        generalId++;
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

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}' + super.toString();
    }

    /**
     * Переопределение метода compareTo
     * Для сортировки
     * по возрасту и идентификатору
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student<T, V> o) {
//        // Вывод работы метода (лог в консоль)
//        System.out.println(super.getName() + " - " + o.getName());

        // Сортировка по имени
        return super.getName().compareTo(o.getName());

//        // Сортировка по возрасту невозможна в случае иерархии основанной на Generic классах
//        if (o.getAge() > super.getAge()) {
//            return -1;
//        }
//
//        if (o.getAge() < super.getAge()) {
//            return 1;
//        }
//        // Сортировка по идентификатору
//        return Integer.compare(id, o.getId());

    }
}
