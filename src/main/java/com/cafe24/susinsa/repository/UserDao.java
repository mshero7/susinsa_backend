package com.cafe24.susinsa.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.dto.UserCheckDTO;
import com.cafe24.susinsa.vo.UserVo;

@Repository
public class UserDao {
	public static final String key = "aa";
	
	@Autowired
	private SqlSession sqlSession;
	
	public Boolean joinable(UserCheckDTO dto) {
		// 아이디가 존재하면 true
		Integer result = sqlSession.selectOne("user.existUserCheck", dto);
		return !(result > 0);
	}

//	public Boolean existId(String id) {
//		Integer result = sqlSession.selectOne("user.getById",id);
//		return null;
//	}

}