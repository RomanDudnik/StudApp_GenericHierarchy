package domain;

/**
 * Промежуточный класс работников
 * для отделения студентов и сотрудников
 */
public class Worker<T, V> extends Person<T,V> {
    /**
     * Конструктор
     *
     * @param name
     * @param age
     */
    public Worker(T name, V age) {
        super(name, age);
    }
}
