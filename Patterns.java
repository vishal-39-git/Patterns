import java.util.*;
import java.lang.*;

public class Patterns 
{   
    
    public void pattern1(int num)
    {
       System.out.println("--------------------------------------------------------------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("* \t");
            }
            System.out.println();
        }
    }

    public void pattern2(int num)
    {
        System.out.println("--------------------------------------------------------------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if(i==j)
                {
                    System.out.print("#\t");
                    
                }else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    public void pattern3(int num)
    {
        System.out.println("--------------------------------------------------------------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=1;j--)
            {
                if(i==j)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

    }

    public void pattern4(int num)
    {
        System.out.println("--------------------------------------------------------------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if((j==1) || (j==num) || (i==1) || (i==num) )
                {
                    System.out.print("#\t");
                }else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

     public void pattern5(int num)
    {
        System.out.println("--------------------------------------------------------------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if((j==1) || (j==num) || (i==1) || (i==num) )
                {
                    System.out.print("#\t");
                }else if(i==j)
                {
                    System.out.print("$\t");
                }else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

     public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = scanner.nextInt();

        Patterns patterns = new Patterns();

        while(true)
        {
             System.out.println("--------------------------------------------------------------------------");
            System.out.println("1 . pattern 1");
            System.out.println("2 . pattern 2");
            System.out.println("3 . pattern 3");
            System.out.println("4 . pattern 4");
            System.out.println("5 . pattern 5");
            System.out.println("6 . Exit");
            System.out.println("Enter your choice");
            
            int num1 = scanner.nextInt();

            switch(num1)
            {
                case 1 :
                        patterns.pattern1(num);
                    break;
                case 2 :
                        patterns.pattern2(num);
                    break;
                case 3 :
                        patterns.pattern3(num);
                    break;
                case 4 :
                        patterns.pattern4(num);
                    break;
                case 5 :
                        patterns.pattern5(num);
                    break;   
                case 6 :
                        return;
                default :
                    System.out.println("invalid choice");
            }
        }
    }
}
