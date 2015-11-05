import java.util.List;
import java.util.Queue;

/**
 * Created by lukasz on 05.11.15.
 */
public class Stack {
    Priority priority;
    StackType stackType;
    Object object;
    Queue q;

    public Stack(Priority priority, Object object)
    {
        this.priority = priority;
        this.object = object;
    }


}
