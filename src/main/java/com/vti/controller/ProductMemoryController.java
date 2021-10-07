package com.vti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.ProductMemory;
import com.vti.response.ProductMemoryResponse;
import com.vti.service.IProductMemoryService;

@RestController
@RequestMapping(value = "api/v1/productmemorycontrollers")
@CrossOrigin("*")
public class ProductMemoryController {

	@Autowired
	private IProductMemoryService productMemoryService;
	
	/**
	 * API getAll ProductMemory
	 * Đổ dữ liệu vào cột filter theo memory
	 */
	
	@GetMapping
	public ResponseEntity<?> getAllProductMemory(){
		List<ProductMemory> listProductMemory = productMemoryService.getAllProductMemory();
		
		List<ProductMemoryResponse> listResponse = new ArrayList<>();
		for (ProductMemory productMemory : listProductMemory) {
			ProductMemoryResponse productMemoryResponse = new ProductMemoryResponse(
					productMemory.getProductMemoryId(), productMemory.getMemoryName());
			listResponse.add(productMemoryResponse);
		}
		
		return new ResponseEntity<>(listResponse, HttpStatus.OK);
	}
}
