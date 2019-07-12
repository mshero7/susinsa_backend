package com.cafe24.susinsa.controller.api;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
import com.cafe24.susinsa.service.UserService;
import com.cafe24.susinsa.vo.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, WebConfig.class})
@WebAppConfiguration
public class UserControllerTest {
	/*
	 * 1. 이미 가입한 회원인지 조사
	 * 2. 이미 가입된 아이디인지 조사
	 * 
	 * */
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private UserService userService;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testDIUserService() {
		assertNotNull(userService);
	}
	// 1. 이미 가입한 이력이 있는 고객인지 조사
	@Test
	public void testJoinable() throws Exception {
		ResultActions resultActions = mockMvc
				.perform(get("/api/user/check/Joinable").contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data[0].email", is("test")));
	}
	
	// 2. 이미 가입된 아이디인지 조사
	@Test
	public void testUserCheckId() throws Exception {
		ResultActions resultActions = mockMvc
				.perform(get("/api/user/check/Id").contentType(MediaType.APPLICATION_JSON));
		
		resultActions.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.result", is("success")))
		.andExpect(jsonPath("$.data[0].email", is("test")));
	}
	
}