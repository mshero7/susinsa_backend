package com.cafe24.susinsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.susinsa.dto.UserCheckDTO;
import com.cafe24.susinsa.dto.UserCheckIdDTO;
import com.cafe24.susinsa.repository.UserDao;
import com.cafe24.susinsa.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public Boolean joinable(UserCheckDTO dto) {
		return userDao.joinable(dto);
	}

	public Boolean existId(UserCheckIdDTO dto) {
		return userDao.existId(dto);
	}

	public Boolean join(UserVo userVo) {
		return userDao.join(userVo);
	}
}