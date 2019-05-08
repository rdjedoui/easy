package com.mda.easy.service.impl;

import com.mda.easy.dao.CorporateEntityRepository;
import com.mda.easy.model.CorporateEntity;
import com.mda.easy.service.CorporateEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CorporateEntityServiceImpl implements CorporateEntityService {

    @Autowired
    CorporateEntityRepository corporateEntityRepository;

    @Override
    public List<CorporateEntity> getAllCorporateEntity() {
        return corporateEntityRepository.findAll();
    }

    @Override
    public CorporateEntity getCorporateEntity(Integer id) {
        return corporateEntityRepository.findById(id).get();
    }

    @Override
    public CorporateEntity addCorporateEntity(CorporateEntity corporateEntity) {
        return corporateEntityRepository.save(corporateEntity);
    }

    @Override
    public CorporateEntity updateCorporateEntity(Integer id, CorporateEntity corporateEntity) throws Exception {
        if (!corporateEntityRepository.existsById(id)) throw new Exception("Entity with id " + id + " not existe");
        corporateEntity.setId(id);
        return corporateEntityRepository.save(corporateEntity);
    }

    @Override
    public void deleteCorporateEntity(Integer id) {
        corporateEntityRepository.deleteById(id);
    }

    @Override
    public void deleteAllCorporateEntity() {
        corporateEntityRepository.deleteAll();
    }
}
