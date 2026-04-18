package br.com.fiap.api_rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table (name = "TB_CLIENTES")
public class Cliente {

    @Id
    @Column( name = "CPF")
    private String cpf;
    @Column( name = "Nome")
    private String nome;
    @Column( name = "Email")
    private String email;
    @Column( name = "Data_Nascimento")
    private LocalDate dataNascimento;
    @Column( name = "Telefone")
    private String telefone;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String email, LocalDate dataNascimento, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
