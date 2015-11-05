/**
 * Created by lukasz on 05.11.15.
 */
public class StackFILOManager extends AbstractStack{


    public StackFILOManager(Object object){
        super(object);
    }


    @Override
    public Stack popFromStack() {
        return stack.remove(stack.size() - 1);
    }
}
