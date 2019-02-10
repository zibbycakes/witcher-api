package com.pojo.witcherapi.service;

import com.pojo.witcherapi.dao.EmpireDaoModel;
import com.pojo.witcherapi.model.Empire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pojo.witcherapi.repository.EmpireRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpireService {
    @Autowired
    EmpireRepository empireRepository;

    public List<Empire> getAllEmpires() {
        List<EmpireDaoModel> empireDaoModels = new ArrayList<>();
        empireRepository.findAll().forEach(empireDaoModels::add);
        return empireDaoModels.stream().map(e -> convertDaoToApiModel(e)).collect(Collectors.toList());
    }

    public Empire getEmpire(String id) {
        return convertDaoToApiModel(empireRepository.findById(id).get());
    }

    public EmpireDaoModel convertApiModeltoDao(Empire empire) {
        if(empire == null) { return null; }
        EmpireDaoModel empireDaoModel = new EmpireDaoModel();
        empireDaoModel.setId(empire.getId());
        empireDaoModel.setName(empire.getName());

        return empireDaoModel;
    }

    public Empire convertDaoToApiModel(EmpireDaoModel empireDaoModel) {
        if(empireDaoModel == null) { return null; }

        Empire empire = new Empire();
        empire.setId(empireDaoModel.getId());
        empire.setName(empireDaoModel.getName());

        return empire;
    }
}
