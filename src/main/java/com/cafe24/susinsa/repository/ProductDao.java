package com.cafe24.susinsa.repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.dto.product.ProductDTO;
import com.cafe24.susinsa.vo.ProductVo;

@Repository
public class ProductDao {
	private static final String NAMESPACE = "product";
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ProductVo> getList() {
		List<ProductVo> list = sqlSession.selectList(NAMESPACE + ".getList");
		
		return list;
	}

	public boolean add(HashMap<String, Object> productMap) {
		int result = sqlSession.insert(NAMESPACE + ".add", productMap);
		return result > 0;
	}

	public boolean delete(long product_no) {
		int result = sqlSession.delete(NAMESPACE + ".delete", product_no);
		return result > 0;
	}

	public ProductDTO getProduct(long product_no) {
		ProductDTO result = sqlSession.selectOne(NAMESPACE + ".getProduct", product_no);
		return result;
	}

	public List<ProductDTO> getProductList() {
		List<ProductDTO> result = sqlSession.selectList(NAMESPACE + ".getProductList");
		return result;
	}

	public List<ProductDTO> getProductByBrandNo(long brand_no) {
		List<ProductDTO> result = sqlSession.selectList(NAMESPACE + ".getProductListByBrandNo", brand_no);
		return result;
	}
	
}
