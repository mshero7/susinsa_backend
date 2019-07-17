package com.cafe24.susinsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.susinsa.dto.UserCheckDTO;
import com.cafe24.susinsa.repository.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public Boolean joinable(UserCheckDTO dto) {
		return userDao.joinable(dto);
	}

//	public Boolean existId(String id) {
//		return userDao.existId(id);
//	}
}