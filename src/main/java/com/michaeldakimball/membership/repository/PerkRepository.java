package com.michaeldakimball.membership.repository;

import com.michaeldakimball.membership.model.Perk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PerkRepository extends CrudRepository<Perk, UUID> {
}
