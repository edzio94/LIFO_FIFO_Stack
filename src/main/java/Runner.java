/**
 * Created by lukasz on 05.11.15.
 */
public class Runner {
    private StackInterface stackManager;

    public Runner(StackInterface stackInterface)
    {
        this.stackManager = stackInterface;
        stackManager.addToStack(Priority.NORMAL, new Integer(4));
        stackManager.addToStack(Priority.URGENT, new Integer(15));
        System.out.println(stackManager.returnSizeStack());
        this.stackManager.showElements();
        this.stackManager.popFromStack();
        System.out.println("After Deleting 1 item");
        this.stackManager.showElements();
    }
}
