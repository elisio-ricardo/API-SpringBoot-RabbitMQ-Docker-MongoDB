package com.desafio.btg.DesafioBTG.repository;

import com.desafio.btg.DesafioBTG.controller.dto.OrderResponse;
import com.desafio.btg.DesafioBTG.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
