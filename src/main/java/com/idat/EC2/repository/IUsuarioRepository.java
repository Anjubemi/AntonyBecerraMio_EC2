package com.idat.EC2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EC2.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByUsuario(String usuario);
}
