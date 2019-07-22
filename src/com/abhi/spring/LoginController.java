package com.abhi.spring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@RequestMapping("/")
@SessionAttributes(value = {"login"})

public class LoginController {
	@Autowired
	LoginService loginService;
	
	@Autowired
	CustomerService customerService;

	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	
	@ModelAttribute("login")
	public Login sessionLogin() {
		return new Login();
	}
	
	@RequestMapping("/credential")
	public String credentialForm(Model model) {
		//Login login = new Login();
		//model.addAttribute("login", login);
		return "credential";
	}
	
	@RequestMapping("/success")
	public String loginForm(@Valid @ModelAttribute("login")Login login,BindingResult result,Model model) {
		if(result.hasErrors()) return "credential";
		else {
			if(loginService.isLogin(login)) {
				List<Customer> customers = new ArrayList<>();
				customers = customerService.fetchAllCustomers();
				model.addAttribute("customers", customers);
				return "success";
			}
			else return "credential";
		}
	}

}
