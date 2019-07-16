package com.cafe24.susinsa.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.susinsa.dto.JSONResult;
import com.cafe24.susinsa.service.UserService;
import com.cafe24.susinsa.vo.UserVo;

import io.swagger.annotations.ApiOperation;

@RestController("userAPIController")
@RequestMapping("/api/user")
public class UserController {
	/*
	 * 1. 이미 가입한 회원인지 조사
	 * 2. 이미 가입된 아이디인지 조사
	 * 3. 회원가입
	 * 4. 로그인 처리
	 * 5. 회원 정보 수정
	 * 6. 회원 로그아웃
	 * 7. 회원 탈퇴
	 */
	
	@Autowired
	private UserService userService;
	
	// 1. 이미 가입한 고객인지 조사
	// 이름과 주민번호로 이미 가입한 고객인지 조회한다.
	@ApiOperation(value="이름과 주민번호로 이미 가입한 고객인지 조회한다.")	
	@RequestMapping(value="/check/Joinable", method=RequestMethod.GET)
	public JSONResult checkJoinable(
			@RequestParam (value="name", required=true, defaultValue="") String name,
			@RequestParam (value="personalNumber", required=true, defaultValue="") String personalNumber) {
		Boolean exist = userService.joinable(name, personalNumber);
		JSONResult result = JSONResult.success(exist);

       return result;
	}
	
	// 2. 이미 가입된 아이디인지 조사
	// GET으로 보내게 되면 주소창으로 나오는데 처리방법.
	@ApiOperation(value="이미 가입된 아이디인지 조사")
	@RequestMapping(value="/check/Id", method=RequestMethod.GET)
	public JSONResult checkId(@RequestParam(value="id", required=true, defaultValue="") String id) {
		Boolean exist = userService.existId(id);
		JSONResult result = JSONResult.success(exist);

       return result;
	}
	

	// 3. 회원가입
	@ApiOperation(value="회원 가입")
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public JSONResult join(	@RequestBody UserVo user) {
		userService.join(user);
       return JSONResult.success(user);
	}
	
	// 4. 로그인 처리
	@ApiOperation(value="회원 로그인")
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public JSONResult login(
			@RequestParam(value="id", required=true, defaultValue="") String id,
			@RequestParam(value="id", required=true, defaultValue="") String password) {
		Boolean exist = userService.existId(id);
		JSONResult result = JSONResult.success(exist);

       return result;
	}
	
	// 5. 회원 정보 수정
	@ApiOperation(value="회원 정보 수정")
	@RequestMapping(value="/update/{Id}", method=RequestMethod.PUT)
	public JSONResult update() {
		JSONResult result = JSONResult.success(null);

       return result;
	}
	
	// 6. 로그아웃 처리
	@ApiOperation(value="회원 로그아웃")
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public JSONResult logout() {
		JSONResult result = JSONResult.success(null);

       return result;
	}
	
	// 7. 회원 탈퇴
	@ApiOperation(value="회원 탈퇴")
	@RequestMapping(value="/withdrawal/{Id}", method=RequestMethod.DELETE)
	public JSONResult withdrawal() {
	   JSONResult result = JSONResult.success(null);
       return result;
	}
}