package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.Product.Credit;
import bank.common.Product.IProduct;
import bank.common.Product.Investment;

public class CloseInvestmentOrCreditOperation extends Operation {

    int productIdToClose;
    IAccount account;

    public CloseInvestmentOrCreditOperation(IAccount account, int productIdToClose) {
        super();
        this.account = account;
        this.productIdToClose = productIdToClose;
        account.doOperation(this);
    }

    public void execute(IProduct product) {
        account.getInnerProducts().forEach((prod) -> {
            if(prod.getId() == productIdToClose){
                changeAmount(prod);
            }
        });
    }

    private float changeAmount(IProduct product) {
        for (Operation operation : product.getOperationHistory().getOperationList()) {
            if (operation.type == OperationType.CREDIT_CREATE) {
                ((Credit) product).setClosed(true);
                ((Credit) product).getInterest().calculate(product);
                this.account.changeBalance(-((Credit) product).getBalance());
            } else if (operation.type == OperationType.INVESTMENT_CREATE) {
                ((Investment) product).setClosed(true);
                ((Investment) product).getInterest().calculate(product);
                this.account.changeBalance(((Investment) product).getBalance());
            }
        }
        return 0;
    }
}
