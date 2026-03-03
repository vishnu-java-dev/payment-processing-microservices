package com.vishnu.payment_service.service;

import com.vishnu.payment_service.dto.PaymentRequest;
import com.vishnu.payment_service.dto.PaymentResponse;

public interface PaymentService {
    PaymentResponse processPayment(PaymentRequest request);
}
