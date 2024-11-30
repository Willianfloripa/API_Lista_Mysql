package com.wtm.todolist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtm.todolist.Model.Todo;

// JpaRepository: Fornece métodos prontos como save, findById, delete, etc
// Usados no service.
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
