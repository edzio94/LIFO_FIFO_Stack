/**
 * Created by lukasz on 05.11.15.
 */
public class StackFactory {
    public static StackInterface create(StackType type,String classID)
    {
        if (type.equals(StackType.FIFO))
            return new StackFIFOManager(classID);
        else
             return new StackFILOManager(classID);
    }

}
