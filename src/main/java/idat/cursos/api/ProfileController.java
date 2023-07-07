package idat.cursos.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@GetMapping("/")
	public Wrapper CodigoYNombreCompleto() {
		return new Wrapper("LN43658535-RUTH LILIANA CARBAJAL BEJARANO");
	}

	@GetMapping("/idat/codigo")
	public Wrapper SoloCodigo() {
		return new Wrapper("LN43658535");
	}	

	@GetMapping("/idat/nombreCompleto")
	public Wrapper SoloNombreCompleto() {
		return new Wrapper("RUTH LILIANA CARBAJAL BEJARANO");
	}		
}