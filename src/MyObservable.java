import java.util.Observable;

/**
 * Created by wang on 2016/11/8.
 */
public class MyObservable extends Observable {


    public void postMessage(String content) {

        setChanged();
        notifyObservers(content);
        System.out.println("被观察者开始发送消息啦!");
    }

}
