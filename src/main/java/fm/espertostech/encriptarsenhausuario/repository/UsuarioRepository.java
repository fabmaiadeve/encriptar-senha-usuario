package fm.espertostech.encriptarsenhausuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fm.espertostech.encriptarsenhausuario.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
	
	public Optional<UsuarioModel> findByLogin(String login);	

}
