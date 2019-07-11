package com.cafe24.susinsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.susinsa.repository.UserDao;
import com.cafe24.susinsa.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public Boolean existEmail(String email) {
		UserVo userVo = userDao.get(email);
		return userVo != null;
	}
	
	public Boolean join(UserVo userVo) {
		return userDao.insert(userVo);
	}

	public UserVo getUser(Long no) {
		return userDao.get(no) ;
	}
	
	
	public boolean updateUser( UserVo userVo ) {
		return userDao.update( userVo ) == 1;
	}
}
