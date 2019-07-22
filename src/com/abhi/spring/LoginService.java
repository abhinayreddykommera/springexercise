package com.abhi.spring;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
public boolean isLogin(Login login) {
		
		if(login.getUserName().equals("abhi@gmail.com") && login.getPassWord().equals("javaabhi"))
			return true;
		else return false;
	}
	
}
