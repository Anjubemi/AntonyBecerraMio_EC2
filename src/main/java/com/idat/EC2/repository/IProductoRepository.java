package com.idat.EC2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EC2.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer>{

}
