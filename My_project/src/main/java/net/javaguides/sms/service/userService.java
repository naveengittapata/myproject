package net.javaguides.sms.service;

import java.util.List;


import net.javaguides.sms.entity.user;

public interface userService {

	List<user> getAllusers();

	user saveStudent(user user);

	user getStudentById(Long id);

}
