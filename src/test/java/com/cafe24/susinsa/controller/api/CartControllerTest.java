package com.cafe24.susinsa.controller.api;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.cafe24.susinsa.config.AppConfig;
import com.cafe24.susinsa.config.WebConfig;
import com.cafe24.susinsa.service.CartService;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, WebConfig.class})
@WebAppConfiguration
@Transactional
public class CartControllerTest {

	/*
	 * 1. 카트 등록
	 * 2. 카트 수량 수정
	 * 3. 카트 삭제
	 * 4. 카트 전체리스트 가져오기
	 * 5. 카트 선택 리스트 가져오기
	 * */
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private CartService cartService;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
//	@Rollback(true)
//	@After
//	public void clear() {}
	
	@Test
	public void testDIProductService() {
		assertNotNull(cartService);
	}
	
	/*
	 * 1. 카트 등록
	 */
	@Test
	public void testAdd() throws Exception {
		ResultActions resultActions;
		
		resultActions =
			mockMvc
			.perform(post("/api/cart/add")
			.param("cart_count", "4")
			.param("cart_client_no", "1")
			.param("cart_opt_full_detail_no", "1")
			.contentType(MediaType.APPLICATION_JSON));
			
		resultActions
			.andExpect(status().isOk())
			.andDo(print());
	}
	
	/*
	 * 2. 선택한 상품을 장바구니에서 삭제합니다.
	 */
	@Test
	public void testDelete() throws Exception {
		ResultActions resultActions;
		List<Long> list = new ArrayList<Long>();
		
		list.add(1L);
		list.add(2L);
		
		resultActions =
			mockMvc
			.perform(delete("/api/cart/delete")
			.contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(list)))
			.andExpect(status().isOk())
			.andDo(print());
	}
	
	/*
	 * 3. 선택한 상품에 대한 수량을 변경합니다.
	 */
	@Test
	public void testModify() throws Exception {
		ResultActions resultActions;
		
		resultActions =				
			mockMvc
			.perform(put("/api/cart/modify")
			.param("cart_no", "1")
			.param("cart_count", "4")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andDo(print());
	}
	
	/*
	 * 4. 전체 카트 리스트를 가져옵니다.
	 */
	@Test
	public void testGetList() throws Exception {
		ResultActions resultActions;
		
		long client_no = 1L;
		
		resultActions =				
			mockMvc
			.perform(get("/api/cart/get/list")
			.contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(client_no)))
			.andDo(print());
	}
	
	/*
	 * 5. 일부 카트리스트를 가져옵니다.
	 */
	@Test
	public void testGet_P_List() throws Exception {
		ResultActions resultActions;
		List<Long> cart_no_list = new ArrayList<Long>();
		
		cart_no_list.add(1L);
		cart_no_list.add(2L);
		
		resultActions =				
			mockMvc
			.perform(get("/api/cart/get/p_list")
			.contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(cart_no_list)))
			.andDo(print());
	}
}