import java.io.*;
class Bitwise{
   public static void main(String args[])throws IOException{
   int num,num3;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    num=Integer.parseInt(br.readLine());
    System.out.println("Enter another number");
    num3=Integer.parseInt(br.readLine());
    System.out.println("~"+num+" = "+ (~num));

    System.out.println("~"+num3+" = "+ (~num3));
    System.out.println(num + " & " +num3+" = "+(num&num3));

    System.out.println(num + " | " +num3+" = "+(num|num3));

    System.out.println(num + " ^ " +num3+" = "+(num^num3));
 
 }
}