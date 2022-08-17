package net.javaguides.sms.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.user;



public interface userRepository extends JpaRepository<user, Long> {

}
