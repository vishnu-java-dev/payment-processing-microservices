package com.cishnu.order_service.serviceimpl;

import com.cishnu.order_service.client.PaymentClient;
import com.cishnu.order_service.dto.OrderRequest;
import com.cishnu.order_service.dto.OrderResponse;
import com.cishnu.order_service.dto.PaymentRequest;
import com.cishnu.order_service.dto.PaymentResponse;
import com.cishnu.order_service.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final PaymentClient paymentClient;

    @Override
    @CircuitBreaker(name = "payment-service", fallbackMethod = "paymentFallback")
    public OrderResponse createOrder(OrderRequest request){
        PaymentRequest paymnetRequest = new PaymentRequest();
        paymnetRequest.setAmount(request.getPrice());

        PaymentResponse paymentResponse = paymentClient.processPayment(paymnetRequest);

        return new OrderResponse("ORDER SUCCESS", paymentResponse.getTransactionId());
    }

    // Fallback method to handle payment failures
    public OrderResponse paymnetFallback(OrderRequest request, Exception ex){
        return new OrderResponse("ORDER CANCELLED DUE TO PAYMENT FAILURE", null);
    }
}
