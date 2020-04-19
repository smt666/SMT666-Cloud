package cn.smt666.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.smt666.ssm.pojo.User;

public interface UserMapper {

	public List<User> findAll();
	
	/**
	 * 获取一个用户的信息。
	 * @param id
	 * @return
	 */
	@Select("select id,name,birthday,address from user where id=#{id}")
	public User get(@Param("id") Integer id);
	
	/**
	 * 用户注册。
	 * @param user
	 */
	@Insert("insert into user(name,birthday,address)"
			+ "values(#{name},#{birthday},#{address})")
	public void insert(User user);
	
	/**
	 * 修改用户的信息。
	 * @param user
	 */
	@Update("update user set"
			+ " name=#{name},birthday=#{birthday},address=#{address}"
			+ " where id=#{id}")
	public void update(User user);
	
	/**
	 * 根据用户ID删除用户的信息。
	 * @param id
	 */
	@Delete("delete from user where id=#{id}")
	public void delete(@Param("id") Integer id);
}
