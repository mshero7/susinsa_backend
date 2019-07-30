package com.cafe24.susinsa.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.susinsa.dto.product.ProductDTO;
import com.cafe24.susinsa.repository.ProductDao;
import com.cafe24.susinsa.vo.ProductVo;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;
	
	public List<ProductVo> getList() {
		return dao.getList();
	}

	public boolean add(HashMap<String, Object> productMap) {
		return dao.add(productMap);
	}

	public boolean delete(long product_no) {
		return dao.delete(product_no);
	}
}
