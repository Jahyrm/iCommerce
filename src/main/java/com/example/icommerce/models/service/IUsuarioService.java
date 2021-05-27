package com.example.icommerce.models.service;

import com.example.icommerce.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsuario(String usuario);
	public Usuario registrar(Usuario u);
}
