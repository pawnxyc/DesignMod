package stratage;
//sort方法接受一个arr 里面的元素实现了这个比较接口。
public class Sort {

//    冒泡排序。
    public static void sort(Comparable[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1]) == 1){
                    Comparable o  = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = o;
                }
            }

        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Cat[] arr = {new Cat(100,"flower"),new Cat(4,"cc"),new Cat(1,"siyu"),new Cat(10,"pawn")};
        Sort.sort(arr);
    }
}
