package services;

import java.util.List;

/**
 * Обобщенный интерфейс(iGeneric) для сервиса
 * @param <T>
 */
public interface iPersonService<T> {

    // получение всех сущностей
    List<T> getAll();
    // создание сущности (регистрация сотрудника)
    void create(String name, int age);
}
