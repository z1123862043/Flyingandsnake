package Api_use;

import java.sql.Array;
import java.util.Arrays;

public class Stringdemo {

    public static void main(String[] args) {

        String a = new String("holle world ！");
        String b = new String("holle world ！");
        String c ;
        int d = 0;
        c = "abcd";
        String e = "";
        String obj = new String("hello");
        System.out.println(a.charAt(0));
        System.out.println(a);
        System.out.println(a.compareTo(b));
        System.out.println( c.concat("sssss"));
        char [] array = c.toCharArray();
        for(int i =array.length-1 ;i>=0;i--){
            e +=array[i];
        }
        System.out.println(e);
        String [] arr = a.split(" ",3);
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
