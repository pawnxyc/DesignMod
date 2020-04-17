package prototype;

import org.aspectj.weaver.ast.Var;
import org.springframework.context.annotation.Scope;

//这种拷贝方式为浅拷贝的方式，如果属性中有引用类型，还是同一个对象，是直接复制。
//如果要实现深拷贝，可以让引用类型也实现cloneable接口，然后在Product里面去调用一次它的clone方法。
@Scope(value = "prototype")
public class Product implements Cloneable{

    public String name;
    public int year;

    @Override
    public String toString() {
        return super.hashCode()+ "====" + this.name+"====" + this.year;
    }
    @Override
    public Product clone() throws CloneNotSupportedException{
        return (Product) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product();
        product.name = "pawn";
        product.year = 11;
        Product p2 = product.clone();
        product.name = "pawn1";
        System.out.println(product);
        System.out.println(p2);

    }
}
