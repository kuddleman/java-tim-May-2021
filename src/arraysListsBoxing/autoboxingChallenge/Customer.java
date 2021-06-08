package arraysListsBoxing.autoboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> listOftransactions = new ArrayList<>();
    private String name;

    public void addTransaction(Double transaction) {
        listOftransactions.add(transaction);
    }


}
