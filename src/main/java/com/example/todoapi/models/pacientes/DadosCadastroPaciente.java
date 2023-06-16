package com.example.todoapi.models.pacientes;

import com.example.todoapi.models.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(
    @NotBlank
    String nome,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String telefone,
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    String cpf,
    @NotBlank
    @Valid
    Endereco endereco) {
}