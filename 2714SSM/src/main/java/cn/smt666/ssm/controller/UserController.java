package cn.smt666.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.smt666.ssm.pojo.User;
import cn.smt666.ssm.service.UserService;

@RestController // RESTFUL形式请求，以JSON串的形式返回。
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 处理"http://localhost:8080/user/findAll"请求的方法。
	 * @return 从数据库中查询出来的数据（JSON格式的字符串数据）。
	 */
	@RequestMapping("/findAll")
	public List<User> findAll() {
		return userService.findAll();
	}

	/**
	 * 根据用户的ID来查询一个用户的信息
	 * @param id
	 * @return 
	 */
	@RequestMapping("/get/{id}")
	public User getUserById(@PathVariable Integer id) {
		return userService.get(id);
	}
	
	/**
	 * 用户新增、注册。
	 * =======================================
	 * 注意，如果是一个对象来接收RESTFUL请求的话，那么接收的参数不用添加@PathVariable注解。
	 * @param user
	 */
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user) {
		try {
			userService.insert(user);
			return "insert success 用户数据<font color='red'>入库</font>成功！";
		} catch (Exception e) {
			return "insert Error 用户<font color='red'>注册</font>失败。。。";
		}
	}
	
	/**
	 * 
	 * @param user 4个参数没有顺序。
	 * @return
	 */
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user) {
		try {
			userService.update(user);
			return "insert success 用户信息<font color='red'>修改</font>成功！";
		} catch (Exception e) {
			return "insert Error 用户信息<font color='red'>修改</font>失败。。。";
		}
	}
	
	/**
	 * 根据用户ID删除用户信息。
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		try {
			userService.delete(id);
			return "insert success 用户信息<font color='red'>删除</font>成功！";
		} catch (Exception e) {
			return "insert Error 用户信息<font color='red'>删除</font>失败。。。";
		}
	}
}
