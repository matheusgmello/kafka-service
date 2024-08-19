package dev.matheus.paymentservice.service.impl;

import dev.matheus.paymentservice.model.Payment;
import dev.matheus.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {} ", payment);
    }
}
