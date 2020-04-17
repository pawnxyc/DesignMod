package templateMethod;

//模板方法设计模式，有一个算法的模板定义好，但是中间的某个步骤的具体实现
//交给重写子类去重写来实现不同的功能需求。
public class Template {
    private final void print(String message){

        System.out.println("#####");

        wrapperPint(message);

        System.out.println("#####");
    }
    public void wrapperPint(String message){

    }

    public static void main(String[] args) {

        Template template1 = new Template(){
            @Override
            public void wrapperPint(String message){
                System.out.println("$"+message+"$");
            }
        };

        template1.print("hello world");


    }
}
