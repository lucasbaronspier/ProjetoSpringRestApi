package br.edu.unoesc.springboot.progII.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.springboot.progII.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query(value = "select u from Usuario u where upper(trim(u.nome)) like %?1%")
	List<Usuario> buscarPorNome(String name);
}
