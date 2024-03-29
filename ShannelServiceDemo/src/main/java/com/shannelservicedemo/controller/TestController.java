package com.shannelservicedemo.controller;

import com.shannelservicedemo.model.SCS;
import com.shannelservicedemo.model.Unit;
import com.shannelservicedemo.repository.UnitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class TestController {

    private final UnitRepository unitRepository;

    public TestController(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }


    @GetMapping("/")
    public void test(){

        SCS scs = new SCS();
        scs.setSCSName("station1");
        scs.setZone("qwerty");
        scs.setLatitude(10);
        scs.setLongitude(40);
        scs.setUserArc(5);
        scs.setDateArc(ZonedDateTime.now());

        Unit unit = new Unit();
        unit.setUnitName("unit1");
        unit.setUserArc(3);
        unit.setUnitNumber("150");
        unit.setSCS(scs);
        unit.setDateArc(ZonedDateTime.now());

        unitRepository.save(unit);


    }
}
