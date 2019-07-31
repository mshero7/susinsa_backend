package com.cafe24.susinsa.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.vo.ShippingVo;

@Repository
public class ShippingDao {
	private static final String NAMESPACE = "shipping";
	public static final String ENC_KEY = "aa";
	@Autowired
	private SqlSession sqlSession;

	public Boolean add(ShippingVo vo) {
		vo.setEnc_key(ENC_KEY);
		int result = sqlSession.insert(NAMESPACE+".add", vo);
		return result > 0;
	}

	public Boolean modify(ShippingVo vo) {
		vo.setEnc_key(ENC_KEY);
		int result = sqlSession.update(NAMESPACE + ".modify", vo);
		return result > 0;
	}

	public Boolean delete(long shipping_no) {
		int result = sqlSession.delete(NAMESPACE + ".delete", shipping_no);
		return null;
	}
	
}
