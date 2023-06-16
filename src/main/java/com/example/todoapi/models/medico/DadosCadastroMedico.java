package com.example.todoapi.models.medico;

import com.example.todoapi.models.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(

    @NotBlank
    String nome,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String telefone,
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,
    @NotNull
    Especialidade especialidade,
    @NotNull
    @Valid
    Endereco endereco){}
