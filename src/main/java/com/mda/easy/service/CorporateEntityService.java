package com.mda.easy.service;

import com.mda.easy.model.CorporateEntity;

import java.util.List;

public interface CorporateEntityService {

    public List<CorporateEntity> getAllCorporateEntity();

    public CorporateEntity getCorporateEntity(final Integer id);

    public CorporateEntity addCorporateEntity(final CorporateEntity corporateEntity);

    public CorporateEntity updateCorporateEntity(Integer id, CorporateEntity corporateEntity) throws Exception;

    public void deleteCorporateEntity(final Integer id);

    public void deleteAllCorporateEntity();

}
