package com.cafe24.susinsa.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.susinsa.repository.UserDao;
import com.cafe24.susinsa.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
		
	
	public Boolean join(UserVo userVo) {
		return userDao.join(userVo);
	}

	public Boolean existId(String id) {
		return userDao.existId(id);
	}

	public Boolean joinable(String name, String personalNumber) {
		return userDao.joinable(name, personalNumber);
	}
}
