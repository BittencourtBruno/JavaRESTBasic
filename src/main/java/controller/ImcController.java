package controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/imc")
public class ImcController {
	
	@RequestMapping("/calcularimc")
	public Double calcular (Double peso,  Double altura) {
		Double imc;
		
		imc = peso / Math.pow(altura, 2);
		
		return imc;
		
	}

}
