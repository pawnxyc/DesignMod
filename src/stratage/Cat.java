package stratage;

import java.util.ArrayList;
import java.util.Collections;

public class Cat implements Comparable{
    public int weight;
    public String name;

    public Cat(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Cat t = (Cat)o;
        return this.weight<t.weight?-1:1;
    }
}
