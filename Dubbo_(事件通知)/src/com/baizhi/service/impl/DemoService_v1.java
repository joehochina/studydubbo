package com.baizhi.service.impl;

import java.util.Date;
import java.util.Map;

import com.alibaba.dubbo.rpc.RpcContext;
import com.baizhi.entity.Computer;
import com.baizhi.entity.User;
import com.baizhi.service.IDemoService;

public class DemoService_v1 implements IDemoService {

	public User methodInvoke(Integer id,String name) {
		// TODO Auto-generated method stub
		User user=new User();
	    user.setId(id);
	    user.setName(name);
	    System.out.println("抛出异常");
		if(id<0) throw new RuntimeException("用户参数不合法");
		return user;
	}

}
