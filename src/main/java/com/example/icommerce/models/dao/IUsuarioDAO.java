package com.example.icommerce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.icommerce.models.entity.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario,Long> {
	public Usuario findByUsuario(String usuario);
}
