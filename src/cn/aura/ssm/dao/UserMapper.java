package cn.aura.ssm.dao;

import org.apache.ibatis.annotations.Select;

import cn.aura.ssm.entity.User;

public interface UserMapper {

	@Select("select * from user where username = #{username}")
	User findByName(String username);
	
}
