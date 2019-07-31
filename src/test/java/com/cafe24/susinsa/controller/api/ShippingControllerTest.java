package com.cafe24.susinsa.controller.api;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
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
import com.cafe24.susinsa.service.ShippingService;
import com.cafe24.susinsa.vo.ShippingVo;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, WebConfig.class})
@WebAppConfiguration
public class ShippingControllerTest {

	/*
	 * 1. 배송지 등록
	 * 2. 배송지 수정
	 * 3. 배송지 삭제
	 * */
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private ShippingService shippingService;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
//	@Rollback(true)
//	@After
//	public void clear() {}
	
	@Test
	public void testDIProductService() {
		assertNotNull(shippingService);
	}
	
	/*
	 * 1. 배송지 등록
	 */
	@Test
	public void testAdd() throws Exception {
		ResultActions resultActions;
		
		ShippingVo vo = new ShippingVo();
		
		vo.setShipping_zip1("03325");
		vo.setShipping_zip2("서울특별시 은평구 갈현로19길 13-7");
		vo.setShipping_zip3("301호");
		vo.setShipping_client_no(1L);
		
		resultActions =
			mockMvc
			.perform(post("/api/shipping/add")
			.contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(vo)))
			.andExpect(status().isOk())
			.andDo(print());
	}
	
	/*
	 * 2. 배송지 수정
	 */
	@Test
	public void testModify() throws Exception {
		ResultActions resultActions;
		
		ShippingVo vo = new ShippingVo();
		
		vo.setShipping_no(2L);
		vo.setShipping_zip1("03325");
		vo.setShipping_zip2("서울특별시 은평구 갈현로19길 13-7");
		vo.setShipping_zip3("301호2222222222222");
		vo.setShipping_client_no(1L);
		
		resultActions =
			mockMvc
			.perform(put("/api/shipping/modify")
			.contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(vo)))
			.andExpect(status().isOk())
			.andDo(print());
	}
	
	/*
	 * 3. 배송지 삭제
	 */
	@Test
	public void testDelete() throws Exception {
		ResultActions resultActions;
		
		long shipping_no = 2L;
		
		resultActions =
			mockMvc
			.perform(delete("/api/shipping/delete/{shipping_no}")
			.contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(shipping_no)))
			.andExpect(status().isOk())
			.andDo(print());
	}
}
