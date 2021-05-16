package com.caffeine.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caffeine.resources.UserResource;
import com.caffeine.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	/**
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping("/{userId}")
	public ResponseEntity<UserResource> findUserById(@PathVariable(required = true, value = "userId") long userId) {
		return ResponseEntity.ok().body(userService.findByUserId(userId));

	}

}
