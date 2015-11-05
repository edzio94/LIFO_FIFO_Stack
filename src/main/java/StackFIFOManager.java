import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 05.11.15.
 */
public class StackFIFOManager extends AbstractStack {

    public StackFIFOManager(String classID) {
    super(classID);

    }

    public void addToStack(Priority p, Object object) {

        if(object.getClass().equals(this.classID.getClass()))
        this.stack.add(new Stack(p,object));
        else
            System.out.println("Cannot add object to stack !");
    }

    public Stack removeFromStack(int index) {
        return stack.remove(index - 1 );
    }

    public Stack popFromStack() {
        return stack.remove(0);
    }

    public int size() {
    return stack.size();
}
}
