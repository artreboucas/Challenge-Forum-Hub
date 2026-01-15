package br.com.alura.forumhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.forumhub.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
