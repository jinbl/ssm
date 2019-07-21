package cn.aura.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.aura.ssm.dao.UserMapper;
import cn.aura.ssm.entity.User;
import cn.aura.ssm.result.CodeMsg;
import cn.aura.ssm.service.UserService;

@Service("userservice")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;
	
	@Override
	public User findByName(String name) {
		return mapper.findByName(name);
	}

	@Override
	public CodeMsg login(User user) {
		//1.判断(空验证,有效值...)
		//2.调用 find
		//3.判断
		//查询数据库中数据
		User u= findByName(user.getUsername());
		
		if(u == null) {  //用户名不存在
			return new CodeMsg(1, "用户名不存在");
		}else {
			if(u.getPassword().equals(user.getPassword())) {
				
				return new CodeMsg(0, "登陆成功",u);
			}else {
				return new CodeMsg(2, "密码错误");
			}
		}
	}

}
