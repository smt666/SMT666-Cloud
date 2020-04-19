package cn.smt666.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.smt666.ssm.mapper.UserMapper;
import cn.smt666.ssm.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMaper;

	@Override
	public List<User> findAll() {
		return userMaper.findAll();
	}

	@Override
	public User get(Integer id) {
		return userMaper.get(id);
	}
	
	@Override
	public void insert(User user) {
		userMaper.insert(user);
	}

	@Override
	public void update(User user) {
		userMaper.update(user);
	}

	@Override
	public void delete(Integer id) {
		userMaper.delete(id);
	}
	
}
