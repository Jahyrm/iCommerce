package com.example.icommerce.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.icommerce.models.entity.Usuario;
import com.example.icommerce.models.service.IUsuarioService;

@Controller
public class LoginController {
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/auth/registro")
	public String registroForm(Model model) {
		model.addAttribute("usuario",new Usuario());
		
		return "registro";
	}
	
	@PostMapping("/auth/registro")
	public String registro(@Valid @ModelAttribute Usuario usuario, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			System.out.println("ERROR404");
			return "redirect:/auth/registro";
		}
		else{
			System.out.println(usuario);
			model.addAttribute("usuario",usuarioService.registrar(usuario));
		}
		return "redirect:/auth/login";
	}
}
