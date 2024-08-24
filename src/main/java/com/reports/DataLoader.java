package com.reports;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.reports.entity.Citizen_Info;
import com.reports.repository.CitizenRepository;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private CitizenRepository citizenRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Citizen_Info c1 = new Citizen_Info();
		c1.setCitizenName("rama");
		c1.setGender("male");
		c1.setPlanName("cash");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setPlanStatus("approved");
		c1.setBenifitAmount(5000.00);
		

		Citizen_Info c2 = new Citizen_Info();
		c2.setCitizenName("bhama");
		c2.setGender("female");
		c2.setPlanName("cash");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setPlanStatus("denied");
		c2.setDenialReason("rental income");
		
		Citizen_Info c3 = new Citizen_Info();
		c3.setCitizenName("raju");
		c3.setGender("male");
		c3.setPlanName("cash");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setPlanStatus("terminated");
		c3.setDenialReason("rental income");
		c3.setBenifitAmount(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminatedReason("Employed");
		
		
		Citizen_Info c4 = new Citizen_Info();
		c4.setCitizenName("rajeev");
		c4.setGender("male");
		c4.setPlanName("food");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setPlanStatus("approved");
		c4.setBenifitAmount(5000.00);
		

		Citizen_Info c5 = new Citizen_Info();
		c5.setCitizenName("soni");
		c5.setGender("female");
		c5.setPlanName("food");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setPlanStatus("denied");
		c5.setDenialReason("rental income");
		
		Citizen_Info c6 = new Citizen_Info();
		c6.setCitizenName("gannu");
		c6.setGender("male");
		c6.setPlanName("food");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setPlanStatus("terminated");
		c6.setDenialReason("rental income");
		c6.setBenifitAmount(4000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminatedReason("Salaried");
		
		
		Citizen_Info c7 = new Citizen_Info();
		c4.setCitizenName("ranjan");
		c4.setGender("male");
		c4.setPlanName("medical");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setPlanStatus("approved");
		c4.setBenifitAmount(4000.00);
		

		Citizen_Info c8 = new Citizen_Info();
		c5.setCitizenName("moni");
		c5.setGender("female");
		c5.setPlanName("food");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setPlanStatus("denied");
		c5.setDenialReason("employed income");
		
		Citizen_Info c9 = new Citizen_Info();
		c6.setCitizenName("ranjan");
		c6.setGender("male");
		c6.setPlanName("food");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setPlanStatus("terminated");
		c6.setDenialReason("rental income");
		c6.setBenifitAmount(4000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminatedReason("Property Income");
		
		Citizen_Info c10 = new Citizen_Info();
		c10.setCitizenName("kanju");
		c10.setGender("male");
		c10.setPlanName("employee");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setPlanStatus("approved");
		c10.setBenifitAmount(4000.00);
		

		Citizen_Info c11 = new Citizen_Info();
		c11.setCitizenName("manisha");
		c11.setGender("female");
		c11.setPlanName("employee");
		c11.setPlanStartDate(LocalDate.now());
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setPlanStatus("denied");
		c11.setDenialReason("employed income");
		
		Citizen_Info c12 = new Citizen_Info();
		c12.setCitizenName("rana");
		c12.setGender("male");
		c12.setPlanName("employee");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setPlanStatus("terminated");
		c12.setDenialReason("rental income");
		c12.setBenifitAmount(4000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminatedReason("Rental Income");
		
		List<Citizen_Info> citizen_info =Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		citizenRepository.saveAll(citizen_info);
	}

}
