/**
 * Created by lukasz on 05.11.15.
 */
public class Main {

    public static void main(String[] args) {

        new Runner(StackFactory.create(StackType.FIFO,Integer.class.getName()));

    }
}
