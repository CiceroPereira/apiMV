package com.example.mvtest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvtest.models.User;
import com.example.mvtest.repository.UserRepository;

@RestController
@RequestMapping(value="/api")
public class UserResource {

	@Autowired
	UserRepository userRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/users")
	public List<User> index(){
		return userRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/user/{id}")
	public User show(@PathVariable(value="id") long id){
		return userRepository.findById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/user")
	public User save(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/user/{id}")
	public void destroy(@PathVariable(value="id") long id) {
		userRepository.deleteById(id);
		
	}
	
	@CrossOrigin
	@PutMapping("/user")
	public User update(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	
}
