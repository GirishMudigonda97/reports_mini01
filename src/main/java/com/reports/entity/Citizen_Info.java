package com.reports.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Citizen_Info")
public class Citizen_Info {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	
	private Double benifitAmount;
	private String denialReason;
	private LocalDate terminatedDate;
	private String terminatedReason;
}
