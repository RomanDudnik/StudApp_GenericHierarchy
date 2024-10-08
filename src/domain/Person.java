package domain;

/**
 * Родительский класс
 */

public abstract class Person<T, V> {

    /**
     * Поля
     */
    private T name;

    private V age;

    /**
     * Конструктор
     * @param name
     * @param age
     */
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Геттеры и сеттеры
     * @return
     */
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
