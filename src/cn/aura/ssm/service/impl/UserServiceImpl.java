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
		//1.�ж�(����֤,��Чֵ...)
		//2.���� find
		//3.�ж�
		//��ѯ���ݿ�������
		User u= findByName(user.getUsername());
		
		if(u == null) {  //�û���������
			return new CodeMsg(1, "�û���������");
		}else {
			if(u.getPassword().equals(user.getPassword())) {
				
				return new CodeMsg(0, "��½�ɹ�",u);
			}else {
				return new CodeMsg(2, "�������");
			}
		}
	}

}
