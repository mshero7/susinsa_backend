package com.cafe24.susinsa.controller.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.susinsa.dto.JSONResult;
import com.cafe24.susinsa.service.CategoryService;
import com.cafe24.susinsa.vo.CategoryVo;

import io.swagger.annotations.ApiOperation;

@RestController("AdminCategoryAPIController")
@RequestMapping("/api/admin/category")
public class AdminCategoryController {
	/*
	 * 1. 카테고리 추가하기.
	 */
	
	
	@Autowired
	private CategoryService categoryService;
	
	// 1. 카테고리 추가하기.
	@ApiOperation(value="상위 카테고리를 선택해 하위 카테고리를 추가합니다.")	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<JSONResult> categoryAdd(
			@ModelAttribute /* @Valid */ CategoryVo vo, BindingResult bindResult) {
		
		if(bindResult.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(bindResult.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = categoryService.add(vo);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}
	
	// 2. 카테고리의 이름 수정
	@ApiOperation(value="카테고리의 이름을 수정합니다.")	
	@RequestMapping(value="/modify", method=RequestMethod.PUT)
	public ResponseEntity<JSONResult> categoryModify(
			@ModelAttribute /* @Valid */ CategoryVo vo, BindingResult bindResult) {
		
		if(bindResult.hasErrors()) 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(bindResult.getAllErrors().get(0).getDefaultMessage()));
		
		Boolean exist = categoryService.update(vo);

       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
	}
	
	// 3. 카테고리의 삭제
		@ApiOperation(value="카테고리를 삭제합니다.")	
		@RequestMapping(value="/delete", method=RequestMethod.PUT)
		public ResponseEntity<JSONResult> categoryDelete(
				@ModelAttribute /* @Valid */ CategoryVo vo, BindingResult bindResult) {
			
			if(bindResult.hasErrors()) 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(JSONResult.fail(bindResult.getAllErrors().get(0).getDefaultMessage()));
			
			Boolean exist = categoryService.delete(vo);

	       return ResponseEntity.status(HttpStatus.OK).body(JSONResult.success(exist));
		}
}