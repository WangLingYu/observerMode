import java.util.Observable;
import java.util.Observer;

/**
 * Created by wang on 2016/11/8.
 */
public class MyObserver implements Observer {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到消息了,收到的消息内容是:" + arg);
    }
}
