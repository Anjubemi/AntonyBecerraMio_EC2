package com.idat.EC2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EC2.dto.UsuarioRequestDTO;
import com.idat.EC2.dto.UsuarioResponseDTO;
import com.idat.EC2.seguridad.JwUtil;
import com.idat.EC2.seguridad.UserDetailService;

@RestController
public class UsuarioController {

	@Autowired
	private JwUtil util;
	
	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioRequestDTO dto){
		
		UserDetails details = service.loadUserByUsername(dto.getUsuario());
		
		return ResponseEntity.ok(new UsuarioResponseDTO(util.generateToken(details.getUsername())));
		
	}
}
