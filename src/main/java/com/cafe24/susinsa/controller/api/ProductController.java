package com.cafe24.susinsa.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.susinsa.dto.JSONResult;
import com.cafe24.susinsa.dto.product.ProductDTO;
import com.cafe24.susinsa.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController("productAPIController")
@RequestMapping("/api/product")
public class ProductController {

	/*
	 * 1. 상품 조회
	 * 2. 상품 리스트 조회
	 *  - 카테고리로 조회
	 *  - 브랜드로 조회
	 *  - 검색어로 조회
	 * 3. 
	 * */
	
	@Autowired
	private ProductService productService;
	
	// 1.상품 조회
	@ApiOperation(value="선택한 상품의 상품상세정보들을 가져온다.")	
	@RequestMapping(value="/get/product/{product_no}", method=RequestMethod.GET)
	public ResponseEntity<JSONResult> getProduct(@PathVariable long product_no) {
		ProductDTO product = productService.getProduct(product_no);
		
       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(product));
	}
	
	// 2.상품 리스트 조회
	// - 메인 리스트 조회
	@ApiOperation(value="메인 페이지에 보여줄 상품들 목록을 가져온다.")	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public ResponseEntity<JSONResult> getProductList() {
		List<ProductDTO> product = productService.getProductList();
		
       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(product));
	}
	
	// 2.상품 리스트 조회
	// - 브랜드로 리스트 조회
	@ApiOperation(value="해당 브랜드의 상품들을 보여준다.")	
	@RequestMapping(value="/get/brand/{product_brand_no}", method=RequestMethod.GET)
	public ResponseEntity<JSONResult> getProductListByBrand(@PathVariable long product_brand_no) {
		List<ProductDTO> product = productService.getProductByBrandNo(product_brand_no);
		
       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(product));
	}
	
//	// 2.상품 리스트 조회
//	// - 검색어로 조건에 만족하는 상품들을 조회
//	public ResponseEntity<JSONResult> getProductListByKeyword(@PathVariable long product_no) {
//		List<ProductDTO> product = productService.getProduct(product_no);
//		
//       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(product));
//	}
	
//	// 2.상품 리스트 조회
//	// - 카테고리 리스트 조회
//	@ApiOperation(value="카테고리")	
//	@RequestMapping(value="/get/category/{category_no}", method=RequestMethod.GET)
//	public ResponseEntity<JSONResult> getProductListByCategory(@PathVariable long category_no) {
//		List<ProductDTO> product = productService.getProduct(category_no);
//		
//       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(product));
//	}
}