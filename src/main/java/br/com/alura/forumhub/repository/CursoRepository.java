package br.com.alura.forumhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.forumhub.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
