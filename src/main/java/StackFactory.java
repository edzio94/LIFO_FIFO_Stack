/**
 * Created by lukasz on 05.11.15.
 */
public class StackFactory {
    public static StackInterface create(StackType type,Object object)
    {
        if (type.equals(StackType.FIFO))
            return new StackFIFOManager(object);
        else
             return new StackFILOManager(object);
    }

}
