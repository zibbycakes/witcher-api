package com.pojo.witcherapi.controller;

import com.pojo.witcherapi.model.Empire;
import com.pojo.witcherapi.service.EmpireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
