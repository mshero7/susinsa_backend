package com.cafe24.susinsa.repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.dto.product.ProductDTO;
import com.cafe24.susinsa.vo.BrandVo;
import com.cafe24.susinsa.vo.ProductVo;

@Repository
public class BrandDao {
	private static final String NAMESPACE = "brand";
	
	@Autowired
	private SqlSession sqlSession;

	public Boolean add(BrandVo vo) {
		int result = sqlSession.insert(NAMESPACE+".add", vo);
		return result > 0;
	}

	public Boolean modify(BrandVo vo) {
		int result = sqlSession.update(NAMESPACE+".modify", vo);
		return result > 0;
	}

	public Boolean delete(long brand_no) {
		int result = sqlSession.delete(NAMESPACE+".delete", brand_no);
		return result > 0;
	}
	
}
