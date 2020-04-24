package dto.dto.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//动态代理不会为具体的接口来创建一个类来代理，而是直接一个动态代理类，要代理的实现类动态传入。
public class ProxyDemo implements InvocationHandler {

    private Object carName;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("欢迎光临大型汽车销售平台，请选购");
        method.invoke(carName,args);
        System.out.println("结束购买，欢迎下次光临");
        return null;
    }
    public ProxyDemo(Object carName){
        this.carName = carName;
    }
}
