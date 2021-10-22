package fm.espertostech.encriptarsenhausuario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fm.espertostech.encriptarsenhausuario.model.UsuarioModel;
import fm.espertostech.encriptarsenhausuario.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/api/usuario")
public class UsuarioController {
	
	private final UsuarioRepository repository;
	
	public UsuarioController(UsuarioRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping(value = "/listartodos")
	public ResponseEntity<List<UsuarioModel>> listarTodos() {
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping(value = "/salvar")
	public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario) {
		
		return ResponseEntity.ok(repository.save(usuario));
	}

}
