package com.wtm.todolist.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtm.todolist.Model.Todo;
import com.wtm.todolist.Repository.TodoRepository;

// Classes anotadas com @Service podem ser injetadas em outras classes para
// fornecer lógica de negócio. O Spring gerencia essas classes, o que significa
// que o ciclo de vida e o gerenciamento de dependências são feitos
// automaticamente.
@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository; // Injetando o repositorio para uso das funções jpa findAll etc..

    // Tarefa para retornar todos do BD
    public List<Todo> retornaTodos() {
        return todoRepository.findAll();
    }

    // Tarefa para retornar um Id opocional do BD
    public Optional<Todo> retornaId(Long id) {
        return todoRepository.findById(id);
    }

    // Salva uma nova tarefa no banco de dados
    public Todo salva(Todo todo) {
        return todoRepository.save(todo);
    }

    // Tarefa para deletar um Id opocional do BD
    public void deletaId(Long id) {
        todoRepository.deleteById(id);
    }

}