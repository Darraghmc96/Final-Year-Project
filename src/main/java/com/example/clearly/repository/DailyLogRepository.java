package com.example.clearly.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clearly.model.DailyLog;
import com.example.clearly.model.User;

//extends the daily log entity and the entitys id field (long)
public interface DailyLogRepository extends JpaRepository<DailyLog, Long> {
	
	//newest first
	  List<DailyLog> findByUserOrderByLogDateDesc(User user);

	    Optional<DailyLog> findByUserAndLogDate(User user, LocalDate logDate);

}
