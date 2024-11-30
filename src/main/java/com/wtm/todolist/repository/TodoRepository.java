package com.wtm.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtm.todolist.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
