import java.io.*;
class EvenOrOdd{
  public static void main(String args[]) throws IOException{
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   int number;
   System.out.println("Enter a number");
   number=Integer.parseInt(br.readLine());
   if(number%2==0)
   System.out.println("The entered number is even");
   else
   System.out.println("The entered number is odd");

}
}