/**
 * Created by wang on 2016/11/8.
 */
public class Main {
    public static void main(String[] args) {
        MyObserver observer1 = new MyObserver("张三");
        MyObserver observer2 = new MyObserver("李四");
        MyObserver observer3 = new MyObserver("王五");
        MyObserver observer4 = new MyObserver("马六");

        MyObservable myObservable = new MyObservable();

        myObservable.addObserver(observer1);
        myObservable.addObserver(observer2);
        myObservable.addObserver(observer3);
        myObservable.addObserver(observer4);

        myObservable.postMessage("测试一下");
    }
}
