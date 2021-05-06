package com.projeto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	

}
