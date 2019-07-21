package cn.aura.ssm.service;

import cn.aura.ssm.entity.User;
import cn.aura.ssm.result.CodeMsg;

public interface UserService {

	User findByName(String name);
	
	CodeMsg login(User user);
	
}
