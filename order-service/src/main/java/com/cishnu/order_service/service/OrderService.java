package com.cishnu.order_service.service;

import com.cishnu.order_service.dto.OrderRequest;
import com.cishnu.order_service.dto.OrderResponse;

public interface OrderService {
    OrderResponse createOrder(OrderRequest request);
}
