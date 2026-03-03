package com.vishnu.payment_service.serviceimpl;

import com.vishnu.payment_service.dto.PaymentRequest;
import com.vishnu.payment_service.dto.PaymentResponse;
import com.vishnu.payment_service.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentResponse processPayment(PaymentRequest request){
        if(request.getAmount()<100){
            throw new RuntimeException("Payment Failed --> Insufficient Amount");
        }
        return new PaymentResponse("SUCCESS", UUID.randomUUID().toString());
    }
}
