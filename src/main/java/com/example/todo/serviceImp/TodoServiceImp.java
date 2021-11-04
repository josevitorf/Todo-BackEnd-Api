package com.example.todo.serviceImp;

import com.example.todo.domain.Todo;
import com.example.todo.repository.TodoRepository;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImp implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo findById(Integer id) {
        Optional<Todo> obj = todoRepository.findById(id);
        return obj.orElse(null);
    }

    @Override
    public List<Todo> findAllOpen() {
        List<Todo> list = todoRepository.findAllOpen();
        return list;
    }

    @Override
    public List<Todo> findAllClose() {
        List<Todo> list = todoRepository.findAllClose();
        return list;
    }

    @Override
    public List<Todo> findAll() {
        List<Todo> list = todoRepository.findAll();
        return list;
    }

    @Override
    public Todo add(Todo obj) {
        obj.setId(null);
        return todoRepository.save(obj);
    }

    @Override
    public Todo update(Integer id, Todo obj) {
        Todo newObj = findById(id);
        newObj.setTitle(obj.getTitle());
        newObj.setDataClose(obj.getDataClose());
        newObj.setDescription(obj.getDescription());
        newObj.setFinish(obj.getFinish());
        return todoRepository.save(newObj);
    }

    @Override
    public void delete(Integer id) {
        todoRepository.deleteById(id);
    }


}
