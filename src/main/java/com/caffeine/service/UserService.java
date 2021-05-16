package com.caffeine.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.caffeine.resources.UserResource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	/***
	 * 
	 * @param userId
	 * @return
	 */
	@Cacheable(value = "user_cache", key = "{#userId}")
	public UserResource findByUserId(long userId) {
		log.info("Trying to get user information for id {} ", userId);
		return new UserResource(1L, "Mesut", "Sarıtaş");
	}

}
