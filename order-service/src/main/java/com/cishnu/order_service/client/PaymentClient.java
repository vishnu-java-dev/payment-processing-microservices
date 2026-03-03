package com.cishnu.order_service.client;

import com.cishnu.order_service.dto.PaymentRequest;
import com.cishnu.order_service.dto.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "payment-service", url = "http://localhost:8081/payments")
public interface PaymentClient {
    @PostMapping("/payments")
    PaymentResponse processPayment(PaymentRequest request);
}
