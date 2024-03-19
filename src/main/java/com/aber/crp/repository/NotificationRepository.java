package com.aber.crp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aber.crp.model.Notification;

@EnableJpaRepositories
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	

	List<Notification> findByUserName(String name);
}
