package com.cafe24.susinsa.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.dto.UserCheckDTO;
import com.cafe24.susinsa.dto.UserCheckIdDTO;
import com.cafe24.susinsa.vo.UserVo;

@Repository
public class UserDao {
	public static final String ENC_KEY = "aa";
	
	@Autowired
	private SqlSession sqlSession;
	
	public Boolean joinable(UserCheckDTO dto) {
		dto.setEnc_key(ENC_KEY);
		// 아이디가 존재하면 true
		int result = sqlSession.selectOne("user.existUserCheck", dto);
		return !(result > 0);
	}

	public Boolean existId(UserCheckIdDTO dto) {
		dto.setEnc_key(ENC_KEY);
		int result = sqlSession.selectOne("user.existId", dto);
		return !(result > 0);
	}

	public Boolean join(UserVo userVo) {
		userVo.setenc_key(ENC_KEY);
		int result = sqlSession.insert("user.join", userVo);
		return result > 0;
	}

}