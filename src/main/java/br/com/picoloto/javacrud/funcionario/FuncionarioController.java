package br.com.picoloto.javacrud.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
@Validated
public class FuncionarioController {
    private final FuncionarioService service;

    @Autowired
    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Funcionario> findAll() {
        return service.findAll();
    }

    @GetMapping("findById")
    public Optional<Funcionario> findById(@RequestParam("id") Long id) {
        return service.findById(id);
    }

    @PostMapping("save")
    public ResponseEntity<Funcionario> save(@Valid @RequestBody Funcionario funcionario) {
        return ResponseEntity.ok(service.save(funcionario));
    }

    @DeleteMapping("delete/{id}")
    public void deletePost(@PathVariable Long id) {
        service.delete(id);
    }
}
