package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dao.OrderRepository;
import com.model.Order;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepo;


	@Override
	public Order saveOrder(Order order) {
		
		return orderRepo.save(order);
	}

}
