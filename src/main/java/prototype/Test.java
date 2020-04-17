package prototype;

public class Test {

        public static void main(String[] args) {

            StringBuffer sb = new StringBuffer("Hello ");

//            System.out.println("Before change, sb = " + sb.toString());
//
//            changeData(sb);
//
//            System.out.println("After changeData(n), sb = " + sb.toString());

            Integer i = 100;
            Integer i2=100;
            Integer i3 = 200;
            Integer i4 = 200;
            System.out.println(i==i2);
            System.out.println(i3 == i4);

        }


        public static void changeData(StringBuffer strBuf) {

            strBuf.append("World!");

        }
}
