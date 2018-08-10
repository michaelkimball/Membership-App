package com.michaeldakimball.membership.service;

import com.michaeldakimball.membership.model.Perk;

import java.util.List;
import java.util.UUID;

public interface PerkService {
    public Perk findById(UUID id);
    public List<Perk> findAllPerks();
    public void addPerk(Perk perk);
    public void deletePerk(Perk perk);
}
