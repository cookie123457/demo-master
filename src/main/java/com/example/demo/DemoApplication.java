package com.example.demo;

import com.example.demo.filter.JwtAuthenticationFilter;
import com.example.demo.util.JwtUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


@SpringBootApplication

@MapperScan("com.example.demo.mapper")

@RestController
public class DemoApplication {

	@GetMapping ("api/protected")
	public @ResponseBody Object hellWorld() {
		return "Hello World! This is a protected api";
	}

	@PostMapping("/login")
	public Object login(HttpServletResponse response, @RequestBody final Account account) throws IOException {
		if(isValidPassword(account)) {
			String jwt = JwtUtil.generateToken(account.username);
			return new HashMap<String,String>(){{
				put("token", jwt);
			}};
		}else {
			return new ResponseEntity(HttpStatus.UNAUTHORIZED);
		}
	}


	@RequestMapping(value = "/params", params = {"name=admin"})
	public String getParams(@RequestParam("name") String name) {
		return "login type " + name;
	}

	@RequestMapping(value = "/params", params = {"name=user"})
	public String getParamsDifferent(@RequestParam("name") String name) {
		return "login type  " + name;
	}


	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		JwtAuthenticationFilter filter = new JwtAuthenticationFilter();
		registrationBean.setFilter(filter);
		return registrationBean;
	}

	private boolean isValidPassword(Account ac) {
		return "admin".equals(ac.username)
				&& "admin".equals(ac.password);
	}


	public static class Account {
		public String username;
		public String password;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}