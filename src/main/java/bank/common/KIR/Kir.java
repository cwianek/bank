package bank.common.KIR;

import bank.common.Bank.Bank;
import bank.common.Operation.ExternalOperation;

import java.util.List;
import java.util.Map;

public class Kir {
    private List<ExternalOperation> inputOperations;
    private Map<String, List<ExternalOperation>> operationsMap;
    private Map<String, Bank> bankMap;

    public void getIncomingOperations(List<ExternalOperation> oprationsList)
    {
        inputOperations.addAll(oprationsList);
    }

    private void execute()
    {
        //TODO: implement here
        inputOperations.clear();
        operationsMap.clear();
    }

    public void sendPackage(String bankId){
        Bank bank = bankMap.get(bankId);
    }

}
