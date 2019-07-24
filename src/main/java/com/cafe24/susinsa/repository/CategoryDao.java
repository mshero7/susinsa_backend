package com.cafe24.susinsa.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.vo.CategoryVo;
import com.cafe24.susinsa.vo.ProductVo;

@Repository
public class CategoryDao {
	@Autowired
	private SqlSession sqlSession;

	public Boolean add(CategoryVo vo) {
		sqlSession.update("category.insert",vo);
		System.out.println(vo.getResult());
		return vo.getResult() == 0;
	}

	public Boolean update(CategoryVo vo) {
		int result = sqlSession.update("category.update",vo);
		return result > 0;
	}

	public Boolean delete(CategoryVo vo) {
		sqlSession.delete("category.deleteChild",vo);
		return vo.getResult() == 0;
	}
	
}
