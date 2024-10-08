package domain;

/**
 * Класс сотрудник
 */
public class Employee<T extends Comparable<T>, V> extends Worker<T, V> {

    /**
     * Поле
     * Специальность
     */
    private T special;

    /**
     * Конструктор
     * @param name
     * @param age
     * @param special
     */
    public Employee(T name, V age, T special) {
        super(name, age);
        this.special = special;
    }
}
