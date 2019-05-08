package com.mda.easy.service.impl;

import com.mda.easy.dao.AuthorityRepository;
import com.mda.easy.model.Authority;
import com.mda.easy.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    AuthorityRepository authorityRepository;

    @Override
    public List<Authority> getAllAuthority() {
        return authorityRepository.findAll();
    }

    @Override
    public Authority getAuthority(Integer id) {
        Authority authority = authorityRepository.findById(id).get();
        return authority;
    }

    @Override
    public Authority addAuthority(Authority authority) {
        Authority autho = authorityRepository.save(authority);
        return autho;
    }

    @Override
    public Authority updateAuthority(Integer id, Authority authority) throws Exception {
        if (!authorityRepository.existsById(id)) throw new Exception("Authority with id " + id + " not exist");
        authority.setId(id);
        return authorityRepository.save(authority);
    }

    @Override
    public void deleteAuthority(Integer id) {
        authorityRepository.deleteById(id);
    }

    @Override
    public void deleteAllAuthority() {
        authorityRepository.deleteAll();
    }
}
