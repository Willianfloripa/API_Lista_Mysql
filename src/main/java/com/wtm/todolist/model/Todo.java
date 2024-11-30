package com.wtm.todolist.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos") // cria na tabela do DB a coluna
@Data // Gera automaticamente métodos e implementações comuns para uma classe.
@NoArgsConstructor // Gera um construtor sem argumentos (padrão).
@AllArgsConstructor // Gera um construtor com todos os argumentos (para inicializar todos os
                    // atributos).
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gerar Id automaticamento no BD
    private Long id;

    @Column(nullable = false) // Define que a coluna correspondente no banco de dados não pode aceitar valores
                              // nulos. Em outras palavras, o banco de dados exigirá que um valor seja
                              // fornecido para este campo ao inserir ou atualizar registros.
    private String titulo; // Usei português por entendimento mas o ideal e title

    @Column(nullable = false) // Define que a coluna correspondente no banco de dados não pode aceitar valores
                              // nulos. Em outras palavras, o banco de dados exigirá que um valor seja
                              // fornecido para este campo ao inserir ou atualizar registros.
    private Boolean completo; // Usei português por entendimento mas o ideal e completed

}
