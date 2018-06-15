package bank.common.Bank;

import bank.common.Bank.Bank;
import bank.common.Operation.ExternalOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kir {
    private List<ExternalOperation> inputOperations;
    private Map<String, List<ExternalOperation>> operationsMap;
    private Map<String, Bank> bankMap;

    public Kir()
    {
        this.inputOperations = new ArrayList<>();
        this.operationsMap = new HashMap<>();
        this.bankMap = new HashMap<>();
    }

    public void getIncomingOperations(List<ExternalOperation> oprationsList)
    {
        inputOperations.addAll(oprationsList);
    }

    private void execute()
    {
        for(ExternalOperation externalOperation: inputOperations){
            operationsMap.get(externalOperation.getIbanDestination()).add(externalOperation);
        }
        inputOperations.clear();
    }

    public List<ExternalOperation> sendPackage(String bankId){
        return operationsMap.get(bankId);
    }





}
