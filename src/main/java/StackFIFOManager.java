import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 05.11.15.
 */
public class StackFIFOManager extends AbstractStack {

    public StackFIFOManager(String classID) {
        super(classID);

    }


    public Stack popFromStack() {
        return stack.remove(0);
    }
}

