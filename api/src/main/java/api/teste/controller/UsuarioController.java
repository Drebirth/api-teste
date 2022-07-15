package api.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.teste.entity.Usuario;
import api.teste.service.UsuarioService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuario;

    public UsuarioController(UsuarioService usuario){
        this.usuario = usuario;
    }

    @GetMapping("/")
    public List<Usuario> getAll(){
        return usuario.getAll();
    }

    @PostMapping("/")
    public void post(@RequestBody Usuario u){
        usuario.post(u);
    }

    @PutMapping("/{id}")
    public Usuario put(@PathVariable @RequestBody Long id, Usuario u){
        return usuario.put(id, u);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        usuario.delete(id);
    }


}
