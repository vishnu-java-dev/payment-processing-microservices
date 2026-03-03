package com.cishnu.order_service.controller;

import com.cishnu.order_service.dto.OrderRequest;
import com.cishnu.order_service.dto.OrderResponse;
import com.cishnu.order_service.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public OrderResponse create(@RequestBody @Valid OrderRequest request){
        return orderService.createOrder(request);
    }

}
