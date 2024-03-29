package com.shannelservicedemo.controller;

import com.shannelservicedemo.model.SCS;
import com.shannelservicedemo.model.Unit;
import com.shannelservicedemo.repository.UnitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.ArrayList;

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

        SCS scs2 = new SCS();
        scs2.setSCSName("station2");
        scs2.setZone("asdfg");
        scs2.setLatitude(15);
        scs2.setLongitude(45);
        scs2.setUserArc(55);
        scs2.setDateArc(ZonedDateTime.now());

        ArrayList<SCS> list = new ArrayList<>();
        list.add(scs);
        list.add(scs2);

        Unit unit = new Unit();
        unit.setUnitName("unit1");
        unit.setUserArc(3);
        unit.setUnitNumber("150");
        unit.setListSCS(list);
        unit.setDateArc(ZonedDateTime.now());

        unitRepository.save(unit);


    }
}
