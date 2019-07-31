package com.cafe24.susinsa.controller.api;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
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
import com.cafe24.susinsa.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, WebConfig.class})
@WebAppConfiguration
public class AdminCategoryControllerTest {

	/*
	 * 1. Category 등록
	 * 2. Category 수정
	 * 3. Category 삭제
	 * */
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private CategoryService categoryService;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	
//	@Rollback(true)
//	@After
//	public void clear() {}
	
	@Test
	public void testDICategoryService() {
		assertNotNull(categoryService);
	}
	
	/*
	 * 1. 카테고리 입력 테스트
	 * a) testCategoryAdd_A()
	 * -- 카테고리를 입력할때 상위 카테고리를 입력하게 되는데 
	 * -- '최상위 카테고리'라는 이름의 카테고리가 기본값으로 최상위 카테고리로 유지된다.
	 */
	@Test
	public void testCategoryAdd_A() throws Exception {
		ResultActions resultActions; 
		// '최상위 카테고리'
		resultActions =
				mockMvc
				.perform(post("/api/admin/category/add")
				.param("pre_category_name", "최상위 카테고리2")
				.param("new_category_name", "남성의류")
				.contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data", is(true)));
	}
	
	/*
	 * 2. 카테고리 수정 테스트
	 * a) testCategoryModify_A()
	 * -- 현재는 최상위 카테고리의 이름을 기준으로 테스트..
	 * -- 카테고리의 이름을 변경하고 싶을때 사용 
	 */
	@Test
	public void testCategoryModify_A() throws Exception {
		ResultActions resultActions; 
		// '남성의류의 상의'
		resultActions =
				mockMvc
				.perform(put("/api/admin/category/modify")
				.param("category_no", "1")
				.param("category_name", "최상위 카테고리2")
				.contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data", is(true)));
	}
	
	/*
	 * 3. 카테고리 삭제 테스트
	 * a) testCategoryDelete_A()
	 * --- 자식을 가진 경우 부모와 자식을 포함해 모두 삭제
	 * --- 자식을 가지지 않은 경우 자신만 삭제.
	 */
	@Test
	public void testCategoryDelete_A() throws Exception {
		ResultActions resultActions; 
		// '남성의류의 상의'
		resultActions =
				mockMvc
				.perform(put("/api/admin/category/delete")
				.param("category_name", "남성의류")
				.contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data", is(true)));
	}
	
}
