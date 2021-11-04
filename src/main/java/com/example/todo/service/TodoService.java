package com.example.todo.service;

import com.example.todo.domain.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    Todo findById(Integer id);

    List<Todo> findAllOpen();

    List<Todo> findAllClose();

    List<Todo> findAll();

    Todo add(Todo obj);

    Todo update(Integer id, Todo obj);

    void delete(Integer id);
}
