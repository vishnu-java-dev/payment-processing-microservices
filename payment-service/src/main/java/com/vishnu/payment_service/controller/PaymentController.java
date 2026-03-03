package com.vishnu.payment_service.controller;

import com.vishnu.payment_service.dto.PaymentRequest;
import com.vishnu.payment_service.dto.PaymentResponse;
import com.vishnu.payment_service.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public PaymentResponse pay(@Validated @RequestBody PaymentRequest request){
        return paymentService.processPayment(request);
    }
}
