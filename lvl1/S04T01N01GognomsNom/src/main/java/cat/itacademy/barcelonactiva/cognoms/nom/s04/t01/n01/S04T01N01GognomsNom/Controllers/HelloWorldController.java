package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01GognomsNom.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/HelloWorld")
	public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
		return "Hola " + nom + ". Estàs executant un projecte Maven";

	}

	@RequestMapping(value = { "/HelloWorld2", "/HelloWorld2/{nom}" })
	public String saluda2(@PathVariable(required = false) String nom) {
		if (nom != null) {
			return "Hola " + nom + ". Estàs executant un projecte Maven";
		} else {
			return "Hola, estàs executant un projecte Maven";
		}
	}
}
