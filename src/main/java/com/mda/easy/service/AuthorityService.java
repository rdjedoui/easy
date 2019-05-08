package com.mda.easy.service;

import com.mda.easy.model.Authority;

import java.util.List;

public interface AuthorityService {

    public List<Authority> getAllAuthority();

    public Authority getAuthority(final Integer id);

    public Authority addAuthority(final Authority authority);

    public Authority updateAuthority(Integer id, Authority authority) throws Exception;

    public void deleteAuthority(final Integer id);

    public void deleteAllAuthority();
}
