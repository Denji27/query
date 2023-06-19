package com.example.query.Service;

import com.example.query.Entity.consumption;
import com.example.query.Repository.ConsumptionRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
@Log4j2
public class ConsumptionService {
    private ConsumptionRepository consumptionRepository;

    @Cacheable(value = "consumptions", key = "#provinceId")
    public List<consumption> findConsumptionByProvinceId(String provinceId){
        System.out.println("call");
        return consumptionRepository.findConsumptionsByProvinceId(provinceId);
    }

    @Cacheable(value = "avgConsumption")
    public Float getAverageConsumption(){
        log.info("call here");
        return consumptionRepository.getAverageConsumption();
    }

    @Cacheable(value = "countConsumption", key = "#countProvinceId")
    public Integer getNumberOfConsumptionByProvinceId(String countProvinceId){
        log.info("count");
        return consumptionRepository.getNumberOfConsumptionByProvinceId(countProvinceId);
    }
    @Cacheable(value = "sumConsumption", key = "#sumProvinceId")
    public Integer getTotalReadUnitByProvinceId(String sumProvinceId){
        log.info("sum");
        return consumptionRepository.getTotalReadUnitByProvinceId(sumProvinceId);
    }
}
