package ClassCodes;

public class ForLoopCodes {
    public static void main(String[] args) {

        System.out.println("numbers 1to 25");
        for(int i=1;i<=25;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        System.out.println("number 25 to 1");
        for(int i=25;i>=1;i--)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        System.out.println("odd numbers 1 to 100");
        for(int i=1;i<=100;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        System.out.println("Even numbers 1 to 100");
        for(int i=2;i<=100;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        System.out.print("Sum of odd numbers 1 to 50");
        int sum=0;
        for(int i=1;i<=100;i+=2)
        {
            sum+=i;
        }
        System.out.println("Sum="+sum+"\n-----------------------------------");

        System.out.print("sum of even numbers 1 to 50");
        sum=0;
        for(int i=2;i<=100;i+=2)
        {
            sum+=i;
        }
        System.out.println("Sum="+sum+"\n-----------------------------------");

        System.out.println("numbers from -45 to 45");
        for(int i=-45;i<=45;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        System.out.print("numbers fro 50 to 100");
        for(int i=50;i<=100;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        int oddSum=0;
        int evenSum=0;
        System.out.println("sum of odd and even");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                evenSum+=i;
            }
            else {
                oddSum+=i;
            }
        }
        System.out.print("EvenSum "+evenSum);
        System.out.print("odd Sum "+oddSum);
        System.out.println("-----------------------------------");

        System.out.println("numbers 1 to 100");
        for(int i=1;i<=100;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        System.out.println("numbers 100 to 1");
        for(int i=100;i>=1;i--)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        System.out.println("numbers 30 to 50");
        for(int i=30;i<=50;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        int count=0;

        System.out.println("count of even numbers from 1 to 25");
        for(int i=2;i<=25;i+=2)
        {
            count++;
        }
        System.out.print("Count: "+count);
        System.out.println("\n-----------------------------------");
        count=0;
        System.out.println("count of even numbers from 1 to 25");
        for(int i=1;i<=25;i+=2)
        {
            count++;
        }
        System.out.print("Count: "+count);
        System.out.println("\n-----------------------------------");


        for(int i=2;i<=20;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");

        for(int i=9;i<=90;i+=9)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.print(0-i);
            }
            else {
                System.out.print(" "+i+" ");
            }
        }
        System.out.println("\n-----------------------------------");
        for(int i=5;i<=50;i+=5)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        int p=1;
        for(int i=1;i<=4;i++)
        {
            System.out.print(p+" ");
            p*=10;
        }
        System.out.println("\n-----------------------------------");
        count=2;
        for(int i=1;i<40;i=i+count)
        {
            System.out.print(i+" ");
            count++;
        }
        System.out.println("\n-----------------------------------");
        for(int i=8;i<=80;i+=8)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        int first=0;
        int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=1;i<=7;i++)
        {
            int c=first+second;
            System.out.print(c+" ");
            first=second;
            second=c;
        }
        System.out.println("\n-----------------------------------");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d ",i*i);
        }
        System.out.println("\n-----------------------------------");
        for(int i=3;i<=30;i+=3)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        for(int i=7;i<=70;i+=7)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        for(int i=4;i<=40;i+=4)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        for (int i=10;i<100;i+=10)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
        for(int i=0;i<10;i++)
        {
            if(i<=5)
                System.out.print(i+" ");
            else
                System.out.printf("%d ",10-i);
        }
        System.out.println("\n-----------------------------------");
        for(int i=6;i<=60;i+=6)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------");
    }
}
