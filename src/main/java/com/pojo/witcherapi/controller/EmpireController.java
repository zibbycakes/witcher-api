package com.pojo.witcherapi.controller;

import com.pojo.witcherapi.model.Empire;
import com.pojo.witcherapi.service.EmpireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpireController {
    @Autowired
    EmpireService empireService;

    @RequestMapping("/empires")
    List<Empire>  getAllEmpires() {
        return empireService.getAllEmpires();
    }

    @RequestMapping("/empires/{id}")
    Empire getEmpire(@PathVariable String id) {
        return empireService.getEmpire(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/empires")
    @ResponseStatus(HttpStatus.CREATED)
    void addEmpire(@RequestBody Empire empire) {
        empireService.addEmpire(empire);
    }
}
