package com.cafe24.susinsa.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.vo.CategoryVo;

@Repository
public class CategoryDao {
	private static final String NAMESPACE = "category";
	
	@Autowired
	private SqlSession sqlSession;

	public Boolean add(CategoryVo vo) {
		sqlSession.update(NAMESPACE + ".insert",vo);
		System.out.println(vo.getResult());
		return vo.getResult() == 0;
	}

	public Boolean update(CategoryVo vo) {
		int result = sqlSession.update(NAMESPACE + ".update",vo);
		return result > 0;
	}

	public Boolean delete(CategoryVo vo) {
		sqlSession.delete(NAMESPACE + ".deleteChild",vo);
		return vo.getResult() == 0;
	}
	
}
