package com.example.todo.repository;

import com.example.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    @Query("SELECT obj FROM Todo obj WHERE obj.finish = false ORDER BY obj.dataClose ASC")
    List<Todo> findAllOpen();

    @Query("SELECT obj FROM Todo obj WHERE obj.finish = true ORDER BY obj.dataClose ASC")
    List<Todo> findAllClose();
}
