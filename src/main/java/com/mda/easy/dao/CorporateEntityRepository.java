package com.mda.easy.dao;

import com.mda.easy.model.CorporateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateEntityRepository extends JpaRepository<CorporateEntity, Integer> {
}
