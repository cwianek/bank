package bank.common.Operation;

import java.util.ArrayList;
import java.util.List;

public class OperationHistory {
    private List<Operation> operationList;

    public OperationHistory(){
        operationList = new ArrayList<Operation>();
    }

    public void add(Operation operation){
        operationList.add(operation);
    }

    public List<Operation> getOperationList() {
        return operationList;
    }
}
