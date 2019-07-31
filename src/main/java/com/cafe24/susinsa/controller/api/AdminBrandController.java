package com.cafe24.susinsa.controller.api;

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
import com.cafe24.susinsa.service.BrandService;
import com.cafe24.susinsa.vo.BrandVo;
import com.cafe24.susinsa.vo.ShippingVo;

import io.swagger.annotations.ApiOperation;

@RestController("shippingAPIController")
@RequestMapping("/api/shipping")
public class AdminBrandController {
	/*
	 * 1. 브랜드 입력하기
	 * 2. 브랜드 삭제
	 * 3. 브랜드 수정
	 */
	
	
	@Autowired
	private BrandService brandService;
	
	@ApiOperation(value="관리자가 브랜드의 정보들을 입력한다.")	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<JSONResult> add(
			@RequestBody BrandVo vo, BindingResult result) {
		if(result.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(result.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = brandService.add(vo);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}

	// 2. 회원의 작성한 배송지를 수정한다.
	@ApiOperation(value="관리자가 브랜드의 정보들을 수정한다.")	
	@RequestMapping(value="/modify/{brand_no}", method=RequestMethod.PUT)
	public ResponseEntity<JSONResult> modify(
			@RequestBody BrandVo vo, BindingResult result) {
		if(result.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(result.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = brandService.modify(vo);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}
	
	// 3. 회원이 작성한 배송지를 삭제한다.
	@ApiOperation(value="관리자가 브랜드 정보를 삭제한다.")	
	@RequestMapping(value="/delete/{brand_no}", method=RequestMethod.DELETE)
	public ResponseEntity<JSONResult> delete(
			@PathVariable long brand_no, BindingResult result) {
		if(result.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(result.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = brandService.delete(brand_no);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}
}