package net.javaguides.sms.service.impl;

import java.util.List;

import net.javaguides.sms.entity.user;
import net.javaguides.sms.service.userService;
import net.javaguides.sms.userRepository.userRepository;





public class userimpl implements userService {
	
	
	public  userRepository UserRepository;
	
	
	
	public userimpl(userRepository userRepository) {
		super();
		UserRepository = userRepository;
	}

	@Override
	public List<user> getAllusers() {
		
		return UserRepository.findAll();
	}

	@Override
	public user saveStudent(user user) {
		
		return UserRepository.save(user);
	}

	@Override
	public user getStudentById(Long id) {
		
		return UserRepository.findById(id).get();
	}

}
