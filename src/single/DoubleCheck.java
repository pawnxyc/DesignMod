package single;

/**双重检索的方式，
 * volatile禁止指令重排，新建对象是先创建一个内存空间，然后再分配一个指针指向它。
 * 第一个if为了效率
 * synchronized放在里面，如果频繁调用这个方法，加在外面的话效率很低。
 *第二个if是为了防止有两个线程 都通过了第一个检索，但是都没创建对象，如果第二层不检索，久会创建两次。
 */
public class DoubleCheck {

    private static volatile DoubleCheck instance;
    private static int i;
    private DoubleCheck() {
    }

    public DoubleCheck getInstance(){
        if(instance!= null){
            synchronized (DoubleCheck.class){
                if(instance!=null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }


}
//静态内部类，把新建放在内部类里面。最常见的一种写法。又jvm来保证线程安全性，因为类加载到内存中 只会进行一次。
class Neibu{
    private static class Inmethod{
        private static final Neibu INSTANCE = new Neibu();
    }
private Neibu(){}

    private Neibu getInstance(){
        return Inmethod.INSTANCE;
    }
}
enum Effetive{
        INSTANCE;
        public void methon1(){

        }

    public static void main(String[] args) {
        for(int i =1;i<100;i++){
            new Thread(()->{
                System.out.println(Effetive.INSTANCE.hashCode());
            }).start();
        }
    }
}