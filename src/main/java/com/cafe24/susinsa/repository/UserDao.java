package com.cafe24.susinsa.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.vo.UserVo;

@Repository
public class UserDao {
	@Autowired
	private SqlSession sqlSession;
	
	public UserVo get(String email) {
		return sqlSession.selectOne("user.getByEmail", email);
	}
	
	public UserVo get(Long no){
		return sqlSession.selectOne("user.getByNo", no);
	}
	
	
	public Boolean insert(UserVo vo) {
		System.out.println(vo);
		int count = sqlSession.insert("user.insert", vo);
		System.out.println(vo);
		return 1 == count;
	}
	
	public int update( UserVo userVo ) {
		return sqlSession.update( "user.update", userVo );
	}	
}