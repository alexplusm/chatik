package ru.server.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    /**
     * SELECT * from ...
     */
    List<T> getAll();

    /**
     * SELECT * ... WHERE cond0 AND ... AND condN
     */
    List<T> getAllWhere(String ... conditions);

    /**
     * INSERT INTO ...
     */
    void insert(T t);
}