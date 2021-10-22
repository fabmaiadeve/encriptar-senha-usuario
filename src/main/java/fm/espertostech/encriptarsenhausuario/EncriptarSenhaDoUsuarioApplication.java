package fm.espertostech.encriptarsenhausuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EncriptarSenhaDoUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncriptarSenhaDoUsuarioApplication.class, args);
	}

}
