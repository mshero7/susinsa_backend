package com.cafe24.susinsa.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.susinsa.dto.cart.CartDTO;
import com.cafe24.susinsa.vo.CartVo;

@Repository
public class CartDao {
	private static final String NAMESPACE = "cart";
	@Autowired
	private SqlSession sqlSession;

	public Boolean add(long cart_count, long cart_client_no, long cart_opt_full_detail_no) {
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("cart_count", cart_count);
		map.put("cart_client_no", cart_client_no);
		map.put("cart_opt_full_detail_no", cart_opt_full_detail_no);
		
		int result = sqlSession.insert(NAMESPACE + ".add", map);
		return result > 0;
	}

	public Boolean delete(List<Long> cart_no_list) {
		int result = sqlSession.delete(NAMESPACE + ".delete", cart_no_list);
		return result > 0;
	}

	public Boolean modify(long cart_no, long cart_count) {
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("cart_count", cart_count);
		map.put("cart_no", cart_no);
		
		int result = sqlSession.update(NAMESPACE + ".modify", map);
		return null;
	}

	public List<CartDTO> getlist(long cart_client_no) {
		List<CartDTO> result = sqlSession.selectList(NAMESPACE + ".getlist", cart_client_no);
		return result;
	}

	public List<CartDTO> get_p_list(List<Long> cart_no_list) {
		List<CartDTO> result = sqlSession.selectList(NAMESPACE + ".get_p_list", cart_no_list);
		return result;
	}

	
}
