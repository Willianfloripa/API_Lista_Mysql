package com.wtm.todolist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wtm.todolist.Model.Todo;
import com.wtm.todolist.Service.TodoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // Anotação indica que é uma classe Restful e lida com HTTP
@RequestMapping("/api/todos") // Anotação indica o caminho das rotas
public class TodoController {

    @Autowired
    private TodoService todoService; // Injetando o service para uso das funções

    @GetMapping // Mapea o HTTP para gerar a lista do BD e mostrar
    public List<Todo> retornaTodos() {
        return todoService.retornaTodos();
    }

    @GetMapping("/{id}") // Parametro usado id para busca no BD.
    public ResponseEntity<Todo> retornaId(@PathVariable Long id) { // A PathVariable indica parâmetro usado retorna
        return todoService.retornaId(id)// Se estiver ok retona id.
                .map(ResponseEntity::ok)// .map retorna 200 se estiver ok.
                .orElse(ResponseEntity.notFound().build()); // se não retona 404 not found.
    }

    @PostMapping
    public Todo salva(@RequestBody Todo todo) {
        return todoService.salva(todo); // Chama o método save(todo) no TodoService para salvar o novo Todo no banco
                                        // dados.
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> incluiTodo(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.retornaId(id)
                .map(existingTodo -> {
                    existingTodo.setTitulo(todo.getTitulo());
                    existingTodo.setCompleto(todo.getCompleto());
                    return ResponseEntity.ok(todoService.salva(existingTodo));
                })
                .orElse(ResponseEntity.notFound().build());
    }
    // Se a tarefa for encontrada, o código dentro da função map é executado. O
    // título e o status de conclusão da tarefa existente são atualizados com os
    // valores fornecidos no corpo da requisição.O existingTodo atualizado é salvo
    // novamente no banco de dados com save(). O
    // retorno é um ResponseEntity com o status 200
    // OK.orElse(ResponseEntity.notFound().build()): Se a tarefa não for encontrada,
    // é retornado o status 404 NOT FOUND.

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletaTodo(@PathVariable Long id) {
        if (todoService.retornaId(id).isPresent()) {
            todoService.deletaId(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    // O método findById(id) do serviço é chamado para verificar se a tarefa
    // existe.todoService.deleteById(id): Se a tarefa for encontrada, o método
    // deleteById(id) é chamado para excluir a tarefa do banco de
    // dados.ResponseEntity.noContent().build(): Se a tarefa for excluída com
    // sucesso, o método retorna um status 204 NO CONTENT, indicando que a tarefa
    // foi excluída e não há conteúdo a ser
    // retornado.ResponseEntity.notFound().build(): Se a tarefa não for encontrada,
    // o método retorna o status 404 NOT FOUND.

}
