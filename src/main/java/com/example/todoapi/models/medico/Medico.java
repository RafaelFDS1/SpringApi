package com.example.todoapi.models.medico;

import com.example.todoapi.models.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dado) {
        this.nome = dado.nome();
        this.email = dado.email();
        this.telefone = dado.telefone();
        this.crm = dado.crm();
        this.especialidade = dado.especialidade();
        this.endereco = dado.endereco();
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dado) {
        if(dado.nome() != null) {
            this.nome = dado.nome();
        }
        if(dado.endereco() != null) {
            this.endereco = dado.endereco();
        }
        if(dado.telefone() != null) {
            this.telefone = dado.telefone();
        }
    }
}