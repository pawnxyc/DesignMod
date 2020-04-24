package single;
//懒汉式，需要才创建，节约内存
public class LazySingle {
    private LazySingle instance;
    private LazySingle(){

    };
    public LazySingle getInstance(){
        if(this.instance == null){
            this.instance = new LazySingle();
        }
        return instance;
    }
}
//饿汉式，直接创建，不管用不用，开销大 效率高

class Hungrey{
    private Hungrey instance = new Hungrey();
    private Hungrey(){}
    public Hungrey getInstance(){
        return this.instance;
    }

}