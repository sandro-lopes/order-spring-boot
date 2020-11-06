package com.github.order.api.services;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.github.order.api.entities.Product;

@Service
public class ProductService {

	public void create(@Valid Product product) {
		// TODO Auto-generated method stub
		
	}

	public Product find(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Product> search() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(@Valid Product product) {
		// TODO Auto-generated method stub
		
	}

}
