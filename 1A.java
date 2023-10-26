import java.util.*;
import java.io.*;

public class shuffle
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i = 0;i<n;i++){
   arr[i] = sc.nextInt();
}
Random r = new Random();
for(int i = 1;i<n;i++){
   int randomindex = r.nextInt(n-i);
   int temp = arr[randomindex];
   arr[randomindex] = arr[n-i];
   arr[n-i] = temp;
}
for(int i = 0;i<n;i++){
   System.out.print(arr[i]+" ");
}
}
}