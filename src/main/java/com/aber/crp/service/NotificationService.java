package com.aber.crp.service;

import java.util.List;

import com.aber.crp.dto.NotificationDto;
import com.aber.crp.dto.PostDto;

public interface NotificationService {
	List<NotificationDto> getNotificationForCurrentUser();

}
