package com.me.maven.service;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.me.maven.dao.UserMapper;
import com.me.maven.model.User;

public class UserService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SqlSession session = getSqlSession();
		UserMapper uMap = session.getMapper(UserMapper.class);
		
		//select data
		User user = uMap.selectByPrimaryKey(Long.valueOf(26));
		System.out.println(user.getUserName());
		
		//insert data
		try {
			User u = new User();
			BeanUtils.copyProperties(u, user);
			
			u.setId(null);
			uMap.insertSelective(u);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		//update data
		uMap.deleteByPrimaryKey(Long.valueOf(243));
		
		//delete data
		user.setTimestamper(new Date());
		uMap.updateByPrimaryKey(user);
		
		//person define sql on mapper
		List<User> users = uMap.findUserByUserName("李晔");
		System.out.println(users.size());
		
		//person define sql on java
		String sql = "select count(id) from user where user_name='李晔'";
		//String sql = "select * from user where user_name='李晔'";
		Connection conn = session.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet ret = ps.executeQuery();
			while(ret.next()) {
				System.out.println(ret.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//finally operation
		session.commit();
		//session.rollback(true);
		session.close();
		
		
	}
	
	
	
	/**
	 * 获取sqlSession
	 * @return
	 */
	public static SqlSession getSqlSession() {
		String configxml = "mybatis/configuration.xml";
		SqlSessionFactory sessionFactory = null;
		try {
			sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(configxml));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sessionFactory.openSession();
	}

}
