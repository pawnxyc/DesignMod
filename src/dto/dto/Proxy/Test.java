package dto.dto.Proxy;

import java.lang.reflect.Proxy;

/**
 * 就是为了aop增强类的功能性 日志记录，性能统计，安全控制，事务处理，异常处理等等。
 * 代理分为静态代理和动态代理两种。
 * 静态代理，代理类需要自己编写代码写成。
 * 动态代理的对象必须实现了某个接口。
 * 动态代理通过 Proxy 动态生成 proxy class，但是它也指定了一个 InvocationHandler 的实现类。
 * 代理模式本质上的目的是为了增强现有代码的功能。
 *
 * 关于cglib 代理的对象类不需要实现接口，通过enhance建立目标类的子类，来实现拦截目标方法。spring aop用的很多。
 */
public class Test {

    public static void main(String[] args) {
        CarSellImpl benz = new CarSellImpl();
        CarSell proxy = (CarSell) Proxy.newProxyInstance(CarSellImpl.class.getClassLoader(),
                CarSellImpl.class.getInterfaces(),
                new ProxyDemo(benz));
        proxy.sell();
        System.out.println(proxy.getClass().getName());
    }
}
