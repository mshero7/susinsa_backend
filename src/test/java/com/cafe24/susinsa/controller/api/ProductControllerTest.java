package com.cafe24.susinsa.controller.api;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cafe24.susinsa.config.AppConfig;
import com.cafe24.susinsa.config.WebConfig;
import com.cafe24.susinsa.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, WebConfig.class})
@WebAppConfiguration
public class ProductControllerTest {

	/*
	 * 1. 상품 조회
	 * 2. 상품 리스트 조회
	 *  - 카테고리로 조회
	 * 3. 
	 * */
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private ProductService productService;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
//	@Rollback(true)
//	@After
//	public void clear() {}
	
	@Test
	public void testDIProductService() {
		assertNotNull(productService);
	}
	
	@Test
	public void testGetProduct() throws Exception {
		ResultActions resultActions; 
		
		long product_no = 2L;
		
		resultActions = mockMvc
				.perform(get("/api/product/get/{product_no}",product_no)
				.contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
//		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data", is(true)));
	}
	
	@Test
	public void testGetProductList() throws Exception {
		ResultActions resultActions; 
		
		resultActions = mockMvc
				.perform(get("/api/product/get")
				.contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
//		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data", is(true)));
	}
	
	@Test
	public void testGetProductListByBrandNo() throws Exception {
		ResultActions resultActions; 
		long product_brand_no = 2L;
		
		resultActions = mockMvc
				.perform(get("/api/product/get/brand/{product_brand_no}",product_brand_no)
				.contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
//		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data", is(true)));
	}
}
