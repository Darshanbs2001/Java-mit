import java.io.*;
class Greatest{
  public static void main(String args[])throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the three numberes");
   int a=Integer.parseInt(br.readLine());
   int b=Integer.parseInt(br.readLine());
   int c=Integer.parseInt(br.readLine());
   int great=a;
   if(great<b)
   {
    great=b;
   }
   else{
       great=c;
     }
   System.out.println(great+" is the greatest of the 3 numbers");
}
}