package com.idat.EC2.service;

import java.util.List;

import com.idat.EC2.dto.ProductoDTORequest;
import com.idat.EC2.dto.ProductoDTOResponse;

public interface IProductoService {

	public void guardarProducto(ProductoDTORequest prod);
	
	public void editarProducto(ProductoDTORequest prod);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	
	public ProductoDTOResponse obtenerProducto(Integer id);
}
