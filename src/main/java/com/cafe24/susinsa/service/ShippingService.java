package com.cafe24.susinsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.susinsa.repository.ShippingDao;
import com.cafe24.susinsa.vo.ShippingVo;

@Service
public class ShippingService {
	@Autowired
	private ShippingDao dao;

	public Boolean add(ShippingVo vo) {
		return dao.add(vo);
	}

	public Boolean modify(ShippingVo vo) {
		return dao.modify(vo);
	}

	public Boolean delete(long shipping_no) {
		// TODO Auto-generated method stub
		return dao.delete(shipping_no);
	}
}
