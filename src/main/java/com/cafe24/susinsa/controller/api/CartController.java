package com.cafe24.susinsa.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.susinsa.dto.JSONResult;
import com.cafe24.susinsa.dto.cart.CartDTO;
import com.cafe24.susinsa.service.CartService;

import io.swagger.annotations.ApiOperation;

@RestController("cartAPIController")
@RequestMapping("/api/cart")
public class CartController {
	/*
	 * 1. 카트 정보 입력하기
	 * 2. 카트 정보 삭제
	 * 3. 카트 수량 수정
	 * 4. 카트 리스트 가져오기
	 */
	@Autowired
	private CartService cartService;
	
	// 1. 선택한 상품과 옵션을 장바구니에 담습니다.
	@ApiOperation(value="회원의 장바구니에 담습니다.")	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<JSONResult> add(
					@RequestParam long cart_count, 
					@RequestParam long cart_client_no,
					@RequestParam long cart_opt_full_detail_no) {
		System.out.println(cart_count);
		System.out.println(cart_client_no);
		System.out.println(cart_opt_full_detail_no);
		
		Boolean results = cartService.add(cart_count, cart_client_no, cart_opt_full_detail_no);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(results));
	}
	
	// 2. 선택한 상품을 장바구니에서 삭제합니다.
	// - 한개부터 다수까지 가능.
	@ApiOperation(value="선택한 상품을 장바구니에서 삭제합니다.")	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public ResponseEntity<JSONResult> delete(
					@RequestBody List<Long> cart_no_list){
		Boolean results = cartService.delete(cart_no_list);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(results));
	}
	
	// 3. 선택한 상품에 대한 수량을 변경합니다.
	@ApiOperation(value="회원의 장바구니에 담습니다.")	
	@RequestMapping(value="/modify", method=RequestMethod.PUT)
	public ResponseEntity<JSONResult> modify(
					@RequestParam long cart_no,
					@RequestParam long cart_count){
		Boolean results = cartService.modify(cart_no, cart_count);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(results));
	}

	// 4. 전체 카트리스트를 가져옵니다.
	@ApiOperation(value="전체 카트리스트를 가져옵니다.")	
	@RequestMapping(value="/get/list", method=RequestMethod.GET)
	public ResponseEntity<JSONResult> getlist(
			@RequestBody long cart_client_no){
		System.out.println(cart_client_no);
		List<CartDTO> results = cartService.getlist(cart_client_no);
		System.out.println("results : " + results);
       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(results));
	}
	
	// 5. 일부 카트리스트를 가져옵니다. 
		@ApiOperation(value="일부 카트리스트를 가져옵니다. ")	
		@RequestMapping(value="/get/p_list", method=RequestMethod.GET)
		public ResponseEntity<JSONResult> getlist(
				@RequestBody List<Long> cart_no_list){
			
			List<CartDTO> results = cartService.get_p_list(cart_no_list);
			
	       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(results));
		}
}