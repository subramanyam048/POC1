package org.Demo.controller;

import java.util.Optional;

import org.Demo.Entity.User;
import org.Demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping("/user")
	public class UserController {

		@Autowired
		
     	UserRepository userRepository;

		
		@PostMapping("/add")
		public User addUser(@RequestBody User user) {

			return userRepository.save(user);
		}

	
		@GetMapping("/all")
		public Iterable<User> allUsery() {

			return userRepository.findAll();
		}

		
		@GetMapping("/{userId}")
		public Optional<User> userById(@PathVariable("userId") int userId) {

			return userRepository.findById(userId);
		}

	
		@PutMapping("/update")
		public User updateUser(@RequestBody User user) {

			return userRepository.save(user);
		}

		@DeleteMapping("/{userId}")
		public void deleteUser(@PathVariable("userId") int userId) {

			userRepository.deleteById(userId);
		
		}
	}


