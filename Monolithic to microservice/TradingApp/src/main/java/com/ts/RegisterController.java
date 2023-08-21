package com.ts;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
	
	Map<String,User> users=new HashMap<String,User>();
	
	public RegisterController() {
		User uu = new User("ravi","ravi","ravi@gmail.com");
		users.put("ravi", uu);
	}
	
	@RequestMapping(value = "/users/all",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,User> getAllRegisteredUsers(){
		return users;
	}
	
	@RequestMapping(value = "/users/{userId}",method = RequestMethod.GET)
	@ResponseBody
	public User getUser(@PathVariable("userId")String userId){
		return users.get(userId);
	}
	
//	@RequestMapping(value = "/users/register", method = RequestMethod.POST)
//	@ResponseBody
//	public String registerUser(@ModelAttribute("userId")String userId,@ModelAttribute("password") String password,@ModelAttribute("email")String email)
//	{
//		User u = new User(userId,password,email);
//		users.put(userId, u);
//		return "<html><body bgcolor=\"coral\">Registered Successfully "+" <a href='http://localhost:8080/index.html'>home to login</a>\"+\"</body></html>";
//	}
	
	@RequestMapping(value = "/users/register", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser(@RequestBody User user)
	{	
		user.setBalance(100000.0);
		users.put(user.getUserId(), user);
		return "<html><body bgcolor=\"coral\">Registered Successfully "+" <a href='http://localhost:8080/index.html'>home to login</a>\"+\"</body></html>";
	}
}
