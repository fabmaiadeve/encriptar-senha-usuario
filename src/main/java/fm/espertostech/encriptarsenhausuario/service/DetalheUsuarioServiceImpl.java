package fm.espertostech.encriptarsenhausuario.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import fm.espertostech.encriptarsenhausuario.data.DetalheUsuarioData;
import fm.espertostech.encriptarsenhausuario.model.UsuarioModel;
import fm.espertostech.encriptarsenhausuario.repository.UsuarioRepository;

@Component
public class DetalheUsuarioServiceImpl implements UserDetailsService {
	
	private final UsuarioRepository repository;
	
	public DetalheUsuarioServiceImpl(UsuarioRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<UsuarioModel> usuario = repository.findByLogin(username);  
		
		if (usuario.isEmpty()) {
			throw new UsernameNotFoundException("Usuario [" + username + "] nao encontrado!");
		}
		
		return new DetalheUsuarioData(usuario);
	}
	
	

}
