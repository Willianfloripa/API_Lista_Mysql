package com.wtm.todolist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtm.todolist.Model.Todo;

@Repository // JpaRepository: Fornece métodos prontos como save, findById, delete, etc
            // usados no service.
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
