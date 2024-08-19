package dev.matheus.paymentservice.service;

import dev.matheus.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
