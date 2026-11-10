package com.example.clearly.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "daily_logs")

public class DailyLog {
	     @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "user_id", nullable = false)
	    private User user;

	    @Column(name = "log_date", nullable = false)
	    private LocalDate logDate;

	    @Column(nullable = false)
	    private int itchScore;

	    @Column(nullable = false)
	    private int severityScore;

	    public DailyLog() {
	    }

	    public Long getId() { return id; }

	    public User getUser() { return user; }
	    public void setUser(User user) { this.user = user; }

	    public LocalDate getLogDate() { return logDate; }
	    public void setLogDate(LocalDate logDate) { this.logDate = logDate; }

	    public int getItchScore() { return itchScore; }
	    public void setItchScore(int itchScore) { this.itchScore = itchScore; }

	    public int getSeverityScore() { return severityScore; }
	    public void setSeverityScore(int severityScore) { this.severityScore = severityScore; }
	}


