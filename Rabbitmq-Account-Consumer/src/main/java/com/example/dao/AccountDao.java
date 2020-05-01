package com.example.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Account;
public interface AccountDao extends CrudRepository<Account, Integer>{

}
