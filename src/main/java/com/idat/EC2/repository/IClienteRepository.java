package com.idat.EC2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EC2.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

}
