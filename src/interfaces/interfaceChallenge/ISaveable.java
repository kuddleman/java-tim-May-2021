package interfaces.interfaceChallenge;

import java.util.List;

public interface ISaveable {
    List<String> write();

    void read(List<String> savedValues);
}
