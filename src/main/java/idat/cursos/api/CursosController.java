package idat.cursos.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/api/curso")
public class CursosController {

    @Autowired
    private CursosRepository cursosRepository;

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Cursos> obtenerTodosCursos() {
		return cursosRepository.findAll();
	}        

	@PostMapping(path="/nuevo") // Map ONLY POST Requests
	public @ResponseBody String agregarNuevoCurso (@RequestParam String nombre
			, @RequestParam Integer creditos) {
		Cursos n = new Cursos();
		n.setNombre(nombre);
		n.setCreditos(creditos);

		cursosRepository.save(n);

		return "Saved";
	}

	@DeleteMapping(path="/eliminar")
	public @ResponseBody String eliminarCurso (@RequestParam Integer id) {
		Cursos n = new Cursos();
		n.setId(id);

		cursosRepository.delete(n);

		return "Deleted";
	}
    
}
