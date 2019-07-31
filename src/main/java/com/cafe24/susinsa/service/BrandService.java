package com.cafe24.susinsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.susinsa.repository.BrandDao;
import com.cafe24.susinsa.vo.BrandVo;

@Service
public class BrandService {
	@Autowired
	private BrandDao dao;

	public Boolean add(BrandVo vo) {
		return dao.add(vo);
	}

	public Boolean modify(BrandVo vo) {
		return dao.modify(vo);
	}

	public Boolean delete(long brand_no) {
		return dao.delete(brand_no);
	}
}
