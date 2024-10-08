package domain;

/**
 * Класс учитель
 */
public class Teacher<T extends Comparable<T> , V> extends Worker<T, V> {

    /**
     * Поле
     * Ученая степень
     */
    private T academicDegree;

    /**
     * Конструктор
     * @param name
     * @param age
     * @param academicDegree
     */
    public Teacher(T name, V age, T academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

}
