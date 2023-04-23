package com.techmart.sales.service;


	/*import com.kevin.ecommerce.domain.Order;
	import com.kevin.ecommerce.repository.OrderRepository;
	import com.kevin.ecommerce.service.OrderService;
	import com.kevin.ecommerce.service.dto.OrderDTO;
	import com.kevin.ecommerce.service.mapper.OrderMapper;
import com.techmart.sales.model.Test;
import com.techmart.sales.repository.OrderRepo;

import lombok.extern.slf4j.Slf4j;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.domain.Page;
	import org.springframework.data.domain.Pageable;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	import java.util.LinkedList;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Collectors;


	@Service
	@Transactional
	public class TestService {

	@Autowired
	OrderRepo orderRepository;

	/**
	 * Save a order
	 *
	 * @param orderDTO the entity to save
	 * @return the persisted entity
	 */
	
	/*public Test save(Test orderDTO) {
	/*    log.debug("Request to save Order : {}", orderDTO);
	    Order order = OrderMapper.INSTANCE.toEntity(orderDTO);
	    order = orderRepository.save(order);
	    return OrderMapper.INSTANCE.toDto(order);
	}

	/**
	 * Get all of orders
	 *
	 * @return the list of entities
	 */
/*	@Override
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
	    log.debug("Request to get all Orders");
	    return orderRepository.findAll().stream()
	            .map(OrderMapper.INSTANCE::toDto)
	            .collect(Collectors.toCollection(LinkedList::new));
	}

	/**
	 * Get specific order
	 *
	 * @param id the id of entity
	 * @return the entity
	 */
/*/*	@Override
	@Transactional(readOnly = true)
	public Optional<OrderDTO> findOne(Long id) {
	    log.debug("Request get Order : {}", id);
	    return orderRepository.findById(id)
	            .map(OrderMapper.INSTANCE::toDto);
	}

	/**
	 * Delete specific order
	 *
	 * @param id the id of entity
	 */
/*	@Override
	public void delete(Long id) {
	    log.debug("Request to delete Order : {}", id);
	    orderRepository.deleteById(id);
	}

	/**
	 * Get all of orders by page
	 * @param pageable
	 * @return
	 */
/*	@Override
	@Transactional(readOnly = true)
	public Page<OrderDTO> findAll(Pageable pageable) {
	    log.debug("pageable");
	    return orderRepository.findAll(pageable).map(OrderMapper.INSTANCE::toDto);
	}
	}*/

