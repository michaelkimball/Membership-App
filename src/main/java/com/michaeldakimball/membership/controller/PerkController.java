package com.michaeldakimball.membership.controller;

import com.michaeldakimball.membership.model.Perk;
import com.michaeldakimball.membership.service.PerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerkController {

    private PerkService perkService;

    @Autowired
    public PerkController(PerkService perkService){
        this.perkService = perkService;
    }

    @RequestMapping("/loaddata")
    public String loadData(){
        perkService.addPerk(new Perk("Salsa Class", 1, "Month", 0));
        perkService.addPerk(new Perk("Yoga Class", 1, "Month", 0));
        perkService.addPerk(new Perk("Pro Match", 0, "Day", 10));
        perkService.addPerk(new Perk("Hotdog", 0, "Day", 3));
        return "{status: success}";
    }

    @RequestMapping("/findall")
    public List<Perk> getAllPerks(){
        return perkService.findAllPerks();
    }
}
