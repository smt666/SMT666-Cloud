package cn.smt666.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smt666.ssm.pojo.User;

public interface UserService {

	public List<User> findAll();
	
	public User get(Integer id);
	
	public void insert(User user);
	
	public void update(User user);
	
	public void delete(Integer id);
}
