package com.michaeldakimball.membership.service;

import com.michaeldakimball.membership.model.Perk;
import com.michaeldakimball.membership.repository.PerkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PerkServiceImpl implements PerkService {

    private PerkRepository perkRepository;

    @Autowired
    PerkServiceImpl(PerkRepository perkRepository){
        this.perkRepository = perkRepository;
    }

    @Override
    public Perk findById(UUID id) {
        return perkRepository.findById(id).orElse(null);
    }

    @Override
    public List<Perk> findAllPerks() {
        return (List<Perk>) perkRepository.findAll();
    }

    @Override
    public void addPerk(Perk perk) {
        perkRepository.save(perk);
    }

    @Override
    public void deletePerk(Perk perk) {
        perkRepository.delete(perk);
    }

}
