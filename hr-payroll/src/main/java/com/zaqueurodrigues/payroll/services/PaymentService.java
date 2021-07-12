package com.zaqueurodrigues.payroll.services;

import com.zaqueurodrigues.payroll.entities.Payment;
import com.zaqueurodrigues.payroll.entities.Worker;
import com.zaqueurodrigues.payroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }


}
