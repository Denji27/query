package com.example.query.Repository;

import com.example.query.Entity.consumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsumptionRepository extends JpaRepository<consumption, Integer> {
    @Query(value = "select c from consumption c, Contract con where c.contractId = con.id and con.provinceId =:provinceId")
    List<consumption> findConsumptionsByProvinceId(@Param("provinceId") String provinceId);
    @Query(value = "select avg(c.readUnit) from consumption c")
    Float getAverageConsumption();
}
