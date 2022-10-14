package com.julanih.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julanih.demo.entity.User;
import com.julanih.demo.service.UserService;

@RestController
@RequestMapping("/userapi")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		return new ResponseEntity<>(service.saveUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/getusers")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(service.allUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getById(@PathVariable Integer id) {
		return new ResponseEntity<>(service.getUser(id), HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/{id}")
	public ResponseEntity deleteUser(@PathVariable Integer id) {
		service.deleteUser(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
