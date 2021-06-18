package br.com.ecommerce.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class ECommerceController {

	@GetMapping
	public String dizOla(Model model) {
		return "teste";
	}
}
