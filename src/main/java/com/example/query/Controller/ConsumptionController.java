package com.example.query.Controller;

import com.example.query.Service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ConsumptionController {
    @Autowired
    ConsumptionService consumptionService;

    @GetMapping("")
    public ResponseEntity<?> test(@RequestParam(required = false, defaultValue = "0", name = "provinceId") String provinceId ){
        if (provinceId.equals("0")){
            return ResponseEntity.ok(consumptionService.getConsumptionRepository().findAll());
        }
        return ResponseEntity.ok(consumptionService.findConsumptionByProvinceId(provinceId));
    }
    @GetMapping("/avg")
//    @Cacheable(value = "avgConsumption")
    public ResponseEntity<?> avg(){
        return ResponseEntity.ok(consumptionService.getAverageConsumption());
    }

    @GetMapping("/count")
    public ResponseEntity<?> count(@RequestParam(value = "provinceId") String provinceId){
        return ResponseEntity.ok(consumptionService.getNumberOfConsumptionByProvinceId(provinceId));
    }

    @GetMapping("/sum")
    public ResponseEntity<?> sum(@RequestParam(value = "provinceId") String provinceId){
        return ResponseEntity.ok(consumptionService.getTotalReadUnitByProvinceId(provinceId));
    }
}
