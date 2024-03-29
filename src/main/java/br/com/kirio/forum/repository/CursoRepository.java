package br.com.kirio.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kirio.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
