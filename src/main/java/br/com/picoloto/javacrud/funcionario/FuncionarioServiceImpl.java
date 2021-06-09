package br.com.picoloto.javacrud.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository repository;

    @Autowired
    public FuncionarioServiceImpl(FuncionarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Funcionario> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Funcionario> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
