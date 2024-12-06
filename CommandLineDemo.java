public class CommandLineDemo
{
       public static void main (String[] args)
       {
              String name ;
              int num1, num2 , num3 ,sum=0;
              float avg;

              name= args[0];
              num1 = Integer.parseInt(args[1]);
              num2 = Integer.parseInt(args[2]);
              num3 = Integer.parseInt(args[3]);


              sum = num1 + num2 + num3;
              avg = (float) sum/3;

              System.out.println("The sum of three numbers is " + sum);
              System.out.println("The average of three numbers is " + avg);
              System.out.println("Thank you Mr. "+name+" . Happy Coding!!! ");





              

        }
}