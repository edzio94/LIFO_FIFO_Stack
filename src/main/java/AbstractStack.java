import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 05.11.15.
 */
public class AbstractStack implements StackInterface {

    protected List<Stack> stack;
    protected String classID;

    public AbstractStack(Object object) {
        this.stack = new ArrayList<>();
        this.classID = object.getClass().getName();
    }

    @Override
    public void addToStack(Priority p, Object object) {
        if (object.getClass().getName().equals(this.classID))
            this.stack.add(new Stack(p, object));
        else
            System.out.println("Cannot add object into stack !");

    }

    @Override
    public Stack removeFromStack(int index) {
        return null;
    }

    @Override
    public Stack popFromStack() {
        return null;
    }
}
