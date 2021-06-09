package br.com.picoloto.javacrud.funcionario;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @NotNull
    Optional<Funcionario> findById(Long id);
}
