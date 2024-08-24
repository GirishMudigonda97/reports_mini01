package com.reports.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.reports.entity.Citizen_Info;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen_Info, Integer> {

    // JPQL query to get distinct plan names
    @Query("SELECT DISTINCT c.planName FROM Citizen_Info c")
    List<String> getPlanNames();

    // JPQL query to get distinct plan statuses
    @Query("SELECT DISTINCT c.planStatus FROM Citizen_Info c")
    List<String> getPlanStatus();
}
