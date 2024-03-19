package com.aber.crp.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.aber.crp.dto.NotificationDto;
import com.aber.crp.mapper.NotificationMapper;
import com.aber.crp.model.Notification;
import com.aber.crp.repository.NotificationRepository ;
import com.aber.crp.service.NotificationService;
import  com.aber.crp.util.Utils;

@Service
public class NotificationServiceImpl implements NotificationService {
     
	@Autowired
	private NotificationRepository notificationRepo;
	
	@Override
	public List<NotificationDto> getNotificationForCurrentUser() {
		List<Notification> notifications = notificationRepo.findByUserName(Utils.getCurrentUserName()); 
		List<NotificationDto> notificationDtoList = NotificationMapper.maptoNotificationDtoList(notifications, new ArrayList<NotificationDto>());
		return notificationDtoList;
	}
	
}
