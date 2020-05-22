package com.example.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Account;
@Repository
public interface AccountDao extends CrudRepository<Account, Integer>{

}
