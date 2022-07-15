package api.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.teste.entity.Usuario;
import api.teste.repository.UsuarioRepositoy;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepositoy usuario;

    public UsuarioService(UsuarioRepositoy usuario){
        this.usuario = usuario;
    }

    public List<Usuario> getAll(){
        return usuario.findAll();
    }

    public Usuario post(Usuario u){
        return usuario.save(u);
    }

    public Usuario put(Long id, Usuario u){
        usuario.findById(id);
        return usuario.save(u);
    }

    public void delete(Long id){
        usuario.deleteById(id);
    }


}
