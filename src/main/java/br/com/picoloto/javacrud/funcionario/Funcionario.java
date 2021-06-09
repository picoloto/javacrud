package br.com.picoloto.javacrud.funcionario;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOME", length = 30, nullable = false)
    @Size(min = 2, max = 30, message = "Nome inválido")
    private String nome;

    @Column(name = "SOBRENOME", length = 50, nullable = false)
    @Size(min = 2, max = 50, message = "Sobrenome inválido")
    private String sobrenome;

    @Column(name = "EMAIL", nullable = false)
    @Email(message = "Email inválido")
    private String email;

    @Column(name = "NUMERONIS", nullable = false)
    @Pattern(regexp = "^[0-9]*$", message = "Número do NIS (PIS) inválido")
    private String numeroNis;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String sobrenome, String email, String numeroNis) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.numeroNis = numeroNis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroNis() {
        return numeroNis;
    }

    public void setNumeroNis(String numeroNis) {
        this.numeroNis = numeroNis;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", numeroNis=" + numeroNis +
                '}';
    }
}
