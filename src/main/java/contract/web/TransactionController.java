package contract.web;


import contract.entity.Transaction;
import contract.service.TransactionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(final TransactionService transactionService){
        this.transactionService = transactionService;
    }

    public List<Transaction> findAllByAccountNumber(String accountNumber){
        return transactionService.findAllByAccountNumber(accountNumber);
    }

}
