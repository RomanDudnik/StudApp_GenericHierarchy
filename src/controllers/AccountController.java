package controllers;

import domain.Person;
import domain.Worker;

import java.util.List;

/**
 * Класс контроллер
 */
public class AccountController {
    /**
     * Generic метод выплаты зарплаты
     * @param person
     * @param salary
     * @param <T>
     * @param <V>
     */
    public <T extends Worker<T, V>, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплата зарплаты: " + salary);
    }

    /**
     * Статический Generic метод
     * Для подсчета среднего возраста из переданого списка сущностей
     * @param persons
     * @param <T>
     */
    public static <T extends Person> double averageAge(List<T> persons) {
        int sumAge = 0;
        for (T person : persons) {
            sumAge += (Integer) person.getAge();
        }
        return (double) sumAge / persons.size();
    }
}
