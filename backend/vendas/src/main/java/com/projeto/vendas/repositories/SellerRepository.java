package com.projeto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	

}
