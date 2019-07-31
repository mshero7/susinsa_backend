package com.cafe24.susinsa.controller.api;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
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
import com.cafe24.susinsa.vo.ImageVo;
import com.cafe24.susinsa.vo.OptDetailVo;
import com.cafe24.susinsa.vo.OptFullDetailVo;
import com.cafe24.susinsa.vo.OptVo;
import com.cafe24.susinsa.vo.ProductVo;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, WebConfig.class})
@WebAppConfiguration
public class AdminProductControllerTest {

	/*
	 * 1. 상품 등록
	 * 2. 상품 수정
	 * 3. 상품 삭제
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
	
	/*
	 * 1. 상품입력 테스트
	 */
	@Test
	@Ignore
	public void testAdd() throws Exception {
		ResultActions resultActions;
		
		Map<String, Object> productMap = new HashMap<String,Object>();
		
		ProductVo productVo = new ProductVo();
		productVo.setProduct_name("오픈형 카라 반팔티");
		productVo.setProduct_price(20000);
		productVo.setProduct_sale(true);
		productVo.setProduct_date(null);
		productVo.setProduct_weight(257);
		productVo.setProduct_brand_no(1L);
		productVo.setProduct_category_no(1L);
		
		// 이미지 경로 지정해주기.
		// 이미지
		ArrayList<ImageVo> list_image = new ArrayList<ImageVo>();
		ImageVo image1 = new ImageVo(1L,"11.png",null, 1, 1L);
		ImageVo image2 = new ImageVo(2L,"11.png",null, 2, 1L);
		list_image.add(image1);
		list_image.add(image2);
		
		
		// 옵션
		ArrayList<OptVo> list_opt = new ArrayList<OptVo>();
		list_opt.add(new OptVo(1L,"컬러",1L));
		list_opt.add(new OptVo(2L,"사이즈",1L));
		

		// 옵션 상세
		ArrayList<OptDetailVo> list_opt_detail = new ArrayList<OptDetailVo>();
		list_opt_detail.add(new OptDetailVo(1L,"블랙",1L));
		list_opt_detail.add(new OptDetailVo(2L,"화이트",1L));
		list_opt_detail.add(new OptDetailVo(3L,"레드",1L));
		list_opt_detail.add(new OptDetailVo(4L,"S",2L));
		list_opt_detail.add(new OptDetailVo(5L,"M",2L));
		

		// 옵션 전체 상세
		ArrayList<OptFullDetailVo> list_opt_full_detail = new ArrayList<OptFullDetailVo>();
		list_opt_full_detail.add(new OptFullDetailVo(1L,"블랙/S", true, true, 0, 100, 1L));
		list_opt_full_detail.add(new OptFullDetailVo(2L,"블랙/M", true, true, 0, 100, 1L));
		list_opt_full_detail.add(new OptFullDetailVo(3L,"레드/S", true, true, 0, 100, 1L));
		list_opt_full_detail.add(new OptFullDetailVo(4L,"레드/M", true, true, 0, 100, 1L));
		list_opt_full_detail.add(new OptFullDetailVo(5L,"화이트/S", true, true, 0, 100, 1L));
		list_opt_full_detail.add(new OptFullDetailVo(6L,"화이트/M", true, true, 0, 100, 1L));
		
		productMap.put("productVo", productVo);
		productMap.put("list_image", list_image);
		productMap.put("list_opt", list_opt);
		productMap.put("list_opt_detail", list_opt_detail);
		productMap.put("list_opt_full_detail", list_opt_full_detail);
		
		System.out.println("productTEST " + productMap);
		
		resultActions =
				mockMvc
				.perform(post("/api/admin/product/add")
				.contentType(MediaType.APPLICATION_JSON).content(new Gson().toJson(productMap)))
				.andExpect(status().isOk())
				.andDo(print());
	}
	
	/*
	 * 2. 상품수정 테스트
	 * 할 예정
	 */
	@Test
	@Ignore
	public void testUpdate() throws Exception {
		
	}
	
	/*
	 * 3. 상품삭제 테스트
	 * */
	@Test
	@Ignore
	public void testDelete() throws Exception {
		ResultActions resultActions;
		
		long product_no = 3L;
		
		resultActions =
				mockMvc
				.perform(delete("/api/admin/product/delete/{product_no}", product_no).contentType(MediaType.APPLICATION_JSON));
		
		resultActions
				.andExpect(status().isOk())
				.andDo(print());
	}
}