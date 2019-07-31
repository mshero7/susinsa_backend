package com.cafe24.susinsa.controller.api;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.susinsa.dto.JSONResult;
import com.cafe24.susinsa.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController("AdminProductAPIController")
@RequestMapping("/api/admin/product")
public class AdminProductController {
	/*
	 * 1. 카테고리 추가하기.
	 */

	@Autowired
	private ProductService productService;

	// 1. 상품 추가하기.
	@ApiOperation(value = "추가시키고 싶은 상품을 입력합니다.")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<JSONResult> productAdd(@RequestBody HashMap<String, Object> productMap, BindingResult bindResult) {
		if (bindResult.hasErrors())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(JSONResult.fail(bindResult.getAllErrors().get(0).getDefaultMessage()));

		boolean result = productService.add(productMap);

		return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(result));
	}

	// 2. 상품 수정하기.
	@ApiOperation(value = "수정하고 싶은 상품을 선택해 상품을 수정합니다.")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<JSONResult> productUpdate(@RequestBody HashMap<String, Object> productMap, BindingResult bindResult) {
		if (bindResult.hasErrors())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(JSONResult.fail(bindResult.getAllErrors().get(0).getDefaultMessage()));

		boolean result = productService.add(productMap);

		return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(result));
	}

	// 3. 상품 삭제하기.
	@ApiOperation(value = "삭제하고 싶은 상품을 선택해 삭제합니다.")
	@RequestMapping(value = "/delete/{product_no}", method = RequestMethod.DELETE)
	public JSONResult productDelete(@PathVariable long product_no) {
		System.out.println("product_delete : " + product_no);
		boolean result = productService.delete(product_no);

		return JSONResult.success(result);
	}
}