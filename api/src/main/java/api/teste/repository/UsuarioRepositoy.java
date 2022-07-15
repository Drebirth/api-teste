package api.teste.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import api.teste.entity.Usuario;

public interface UsuarioRepositoy extends JpaRepository<Usuario, Long> {
    
}
