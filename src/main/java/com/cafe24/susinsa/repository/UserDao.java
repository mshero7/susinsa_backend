package com.cafe24.susinsa.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.vo.UserVo;

@Repository
public class UserDao {
	@Autowired
	private SqlSession sqlSession;
	
	// 임시데이터
	List<UserVo> user_list = Arrays.asList(
			new UserVo(1L,"mshero7@naver.com","1234","문상수",
					"M","930831-1111111","010-2526-7336","Bronze",0, null));
	
	public Boolean join(UserVo vo) {
		boolean result = vo == null ? true : false;
		return result;
	}

	public Boolean existId(String id) {
		String db_id = user_list.get(0).getId();
		
		return db_id.equals(id);
	}

	public Boolean joinable(String name, String personalNumber) {
		UserVo db_user = user_list.get(0);
		System.out.println(db_user.getName());
		System.out.println(name);
		System.out.println(db_user.getName().equals(name));
		return db_user.getName().equals(name) && db_user.getPersonalNumber().equals(personalNumber);
	}
	
}