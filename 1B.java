import java.util.*;
import java.io.*;
public class romantonumeric
{
    public static int romantonumber(String str, int n){
        HashMap<Character,Integer> hmap = new HashMap<>();
        hmap.put('I',1);
        hmap.put('V',5);
        hmap.put('X',10);
        hmap.put('L',50);
        hmap.put('C',100);
        hmap.put('D',500);
        hmap.put('M',1000);
        int total = 0;
        int i = 0;
        for(i = 0;i<(n-1);i++){
            char ch = str.charAt(i);
            if(hmap.get(ch)>=hmap.get(str.charAt(i+1))){
                total+=hmap.get(ch);
            }
            else{
               total+=hmap.get(str.charAt(i+1))-hmap.get(ch);
               i++;
            }
        }
        if(i!=n){
            total+=hmap.get(str.charAt(n-1));
        }
        return total;
    }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int res = romantonumber(str,str.length());
System.out.println(res);
}
}
