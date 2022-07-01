import java.util.Arrays;
import java.util.List;

public enum Comands {
    ADD,
    LIST,
    EXIT;

    private final List<String> values;

    Comands(String ...values) {
        this.values = Arrays.asList(values);
    }

    public java.util.List<String> getValues() {
        return values;
    }
}

  /*/      Comands cm = Comands.valueOf("ADD");
        Comands cm = Comands.valueOf("LIST");
      Comands cm = Comands.valueOf("EXIT");
 /*/