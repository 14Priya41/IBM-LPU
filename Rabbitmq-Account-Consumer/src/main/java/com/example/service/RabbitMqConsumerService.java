package com.example.service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AccountDao;
import com.example.model.Account;

@Service
public class RabbitMqConsumerService {
private AccountDao accountDao;
	
	@Autowired
	public RabbitMqConsumerService(AccountDao accountDao) {
		super();
		this.accountDao=accountDao;
	}

	private static final String QUEUE = "accounts-queue";

	@RabbitListener(queues = QUEUE)
	public void receiveMessage(Account account) {

		System.out.println("Received Message from Accounts Queue >>" + account);
		accountDao.save(account);
		
	}
}
