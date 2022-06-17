package com.idat.EC2.service;

import java.util.List;

import com.idat.EC2.dto.BodegaDTORequest;
import com.idat.EC2.dto.BodegaDTOResponse;


public interface IBodegaService {
	
	public void guardarBodega(BodegaDTORequest bod);
	
	public void editarBodega(BodegaDTORequest bod);
	
	public void eliminarBodega(Integer id);
	
	public List<BodegaDTOResponse> listarBodegas();
	
	public BodegaDTOResponse obtenerBodega(Integer id);
}
