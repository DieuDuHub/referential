package com.allianz.tech.referential.repositories;

import com.allianz.tech.referential.entities.Dcx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DcxRepository extends CrudRepository<Dcx, Integer> {
}