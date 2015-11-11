import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 05.11.15.
 */
public class AbstractStack implements StackInterface {

    protected List<Stack> stack;
    protected String classID;

    public AbstractStack(String classID) {
        this.stack = new ArrayList<>();
        this.classID = classID;
        System.out.println("This. ID = "+this.classID);
    }

    @Override
    public void addToStack(Priority p, Object object) {
        if (object.getClass().getName().equals(this.classID))
            this.stack.add(new Stack(p, object));
        else {
            System.out.println("Cannot add object into stack !");
            System.out.println("Object is :"+object.getClass().getName());
            System.out.println("TESTING !");
        }

    }

    @Override
    public Stack removeFromStack(int index) {
        return null;
    }

    @Override
    public Stack popFromStack() {
        return null;
    }

    @Override
    public int returnSizeStack() {
        return stack.size();
    }

    @Override
    public void showElements() {
        for (Stack q : stack)
            System.out.println(q.object + "|"+q.priority);
    }

}
