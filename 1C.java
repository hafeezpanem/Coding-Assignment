import java.util.*;
import java.io.*;
public class pangram
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int[] charArr = new int[26];
int count = 0;
for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                ch = (char)(ch+32);
                int n = ch-97;
                if(charArr[n]==0){
                    count++;
                    charArr[n] = 1;
                }
                else{
                    charArr[n] = charArr[n]++;
                }
            }
            else if(ch>=97 && ch<=122){
                int m = ch-97;
                if(charArr[m]==0){
                    count++;
                    charArr[m] = 1;
                }
                else{
                    charArr[m] = charArr[m]++;
                }
            }
}
if(count == 26){
   System.out.println("Pangram");
}
else{
   System.out.println("Not a Pangram");
}
}
}