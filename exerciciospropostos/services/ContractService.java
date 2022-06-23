package cursonelioalves.exerciciospropostos.services;

import cursonelioalves.exerciciospropostos.entities.Contract;
import cursonelioalves.exerciciospropostos.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        // Nos comentários o exemplo é de um empréstimo de R$600 em 3X.
        double basicQuota = contract.getTotalValue() / months;
        //basicQuota = R$200
        for (int i = 1; i <= months; i++) {
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            // updatedQuota = R$202 (valor da parcela * 1%)
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            //fullQuota = R$206,04 (valor da parcela + (1% * 2%))
            Date dueDate = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installment(dueDate, fullQuota));
        }
    }

    private Date addMonths(Date date, int N) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return  calendar.getTime();
    }
}
