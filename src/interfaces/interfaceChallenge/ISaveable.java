package interfaces.interfaceChallenge;

import java.util.ArrayList;

public interface ISaveable {
    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
}
