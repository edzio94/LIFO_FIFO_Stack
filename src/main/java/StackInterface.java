/**
 * Created by lukasz on 05.11.15.
 */
public interface StackInterface {

    void addToStack(Priority p, Object object);
    Stack removeFromStack(int index);
    Stack popFromStack();
    int returnSizeStack();
    void showElements();



}
