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
import com.cafe24.susinsa.service.ShippingService;
import com.cafe24.susinsa.vo.ShippingVo;

import io.swagger.annotations.ApiOperation;

@RestController("shippingAPIController")
@RequestMapping("/api/shipping")
public class ShippingController {
	/*
	 * 1. 배송지 입력하기
	 * 2. 배송지 삭제
	 * 3. 배송지 수정
	 */
	
	
	@Autowired
	private ShippingService shippingService;
	
	// 1. 회원의 작성한 배송지를 추가한다.
	@ApiOperation(value="회원의 배송지를 입력합니다.")	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<JSONResult> add(
			@RequestBody ShippingVo vo, BindingResult result) {
		if(result.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(result.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = shippingService.add(vo);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}

	// 2. 회원의 작성한 배송지를 수정한다.
	@ApiOperation(value="회원의 배송지를 입력합니다.")	
	@RequestMapping(value="/modify/{shipping_no}", method=RequestMethod.PUT)
	public ResponseEntity<JSONResult> modify(
			@RequestBody ShippingVo vo, BindingResult result) {
		if(result.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(result.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = shippingService.modify(vo);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}
	
	// 3. 회원이 작성한 배송지를 삭제한다.
	@ApiOperation(value="회원의 배송지를 입력합니다.")	
	@RequestMapping(value="/delete/{shipping_no}", method=RequestMethod.DELETE)
	public ResponseEntity<JSONResult> delete(
			@PathVariable long shipping_no, BindingResult result) {
		if(result.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(result.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = shippingService.delete(shipping_no);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}
}