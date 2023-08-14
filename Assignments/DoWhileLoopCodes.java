package ClassCodes;

public class DoWhileLoopCodes {
    public static void main(String[] args) {
        int i;
        System.out.println("numbers 1to 25");
        i=1;
        do {
            System.out.print(i+" ");
            i++;
        }
        while(i<=25);
        System.out.println("\n-----------------------------------");

        System.out.println("number 25 to 1");
        i=25;
        do {
            System.out.print(i+" ");
            i--;
        }
        while(i>1);
        System.out.println("\n-----------------------------------");

        System.out.println("odd numbers 1 to 100");
        i=1;
        do {
            System.out.print(i+" ");
            i+=2;
        }
        while(i<=100);
        System.out.println("\n-----------------------------------");

        System.out.println("Even numbers 1 to 100");
        i=2;
        do {
            System.out.print(i+" ");
            i+=2;
        }
        while(i<=100);

        System.out.println("\n-----------------------------------");

        System.out.print("Sum of odd numbers 1 to 50");
        int sum=0;
        i=1;
        do {
            sum+=i;
            i+=2;
        }
        while(i<=100);
        System.out.println("Sum="+sum+"\n-----------------------------------");

        System.out.print("sum of even numbers 1 to 50");
        sum=0;
        i=2;
        do {
            sum+=i;
            i+=2;
        }
        while(i<=100);
        System.out.println("Sum="+sum+"\n-----------------------------------");

        System.out.println("numbers from -45 to 45");
        i=-45;
        do {
            System.out.print(i+" ");
            i++;
        }
        while(i<=45);
        System.out.println("\n-----------------------------------");

        System.out.print("numbers fro 50 to 100");
        i=50;
        do {
            System.out.print(i+" ");
            i++;
        }
        while(i<=100);
        System.out.println("\n-----------------------------------");

        int oddSum=0;
        int evenSum=0;
        System.out.println("sum of odd and even");
        i=1;
        do {
            if(i%2==0)
            {
                evenSum+=i;
            }
            else {
                oddSum+=i;
            }
            i++;
        }
        while(i<=100);

        System.out.print("EvenSum "+evenSum);
        System.out.print("odd Sum "+oddSum);
        System.out.println("-----------------------------------");

        System.out.println("numbers 1to 100");
        i=1;
        do {
            System.out.print(i+" ");
            i++;
        }
        while(i<=100);
        System.out.println("\n-----------------------------------");

        System.out.println("numbers 100to 1");
        i=100;
        do {
            System.out.print(i+" ");
            i--;
        }
        while(i>=1);
        System.out.println("\n-----------------------------------");

        System.out.println("numbers 30 to 50");
        i=30;
        do {
            System.out.print(i+" ");
            i++;
        }
        while(i<=50);
        System.out.println("\n-----------------------------------");

        int count=0;

        System.out.println("count of even numbers from 1 to 25");
        i=2;
        do {
            count++;
            i+=2;
        }
        while(i<=25);
        System.out.print("Count: "+count);
        System.out.println("\n-----------------------------------");
        count=0;
        System.out.println("count of odd numbers from 1 to 25");
        i=1;
        do {
            count++;
            i+=2;
        }
        while(i<=25);
        System.out.print("Count: "+count);
        System.out.println("\n-----------------------------------");
        i=2;
        do
        {
            System.out.print(i+" ");
            i+=2;
        }while (i<=20);

        System.out.println("\n-----------------------------------");
        i=9;
        do{
            System.out.print(i+" ");
            i+=9;
        }
        while (i<=90);

        System.out.println("\n-----------------------------------");
        i=1;
        do {
            if(i%2==0)
            {
                System.out.print(-i);
            }
            else {
                System.out.print(" "+i+" ");
            }
            i++;
        }while (i<=10);

        System.out.println("\n-----------------------------------");
        i=5;
        do {
            System.out.print(i+" ");
            i+=5;
        }while (i<=50);

        System.out.println("\n-----------------------------------");
        int p=1;
        i=1;
        do {
            System.out.print(p+" ");
            p*=10;
            i++;
        }while (i<=4);

        System.out.println("\n-----------------------------------");
        count=2;
        i=1;
        do {
            System.out.print(i+" ");
            i+=count;
            count++;
        }while (i<40);

        System.out.println("\n-----------------------------------");
        i=8;
        do {
            System.out.print(i+" ");
            i+=8;
        }while (i<=80);

        System.out.println("\n-----------------------------------");
        int first=0;
        int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        i=1;
        do {
            int c=first+second;
            System.out.print(c+" ");
            first=second;
            second=c;
            i++;
        }while (i<=7);

        System.out.println("\n-----------------------------------");
        i=1;
        do {
            System.out.printf("%d ",i*i);
            i++;
        }while (i<=10);

        System.out.println("\n-----------------------------------");
        i=3;
        do {
            System.out.print(i+" ");
            i+=3;
        }while (i<=30);

        System.out.println("\n-----------------------------------");
        i=7;
        do {
            System.out.print(i+" ");
            i+=7;
        }while (i<=70);

        System.out.println("\n-----------------------------------");
        i=4;
        do {
            System.out.print(i+" ");
            i+=4;
        }while (i<=40);

        System.out.println("\n-----------------------------------");
        i=10;
        do {
            System.out.print(i+" ");
            i+=10;
        }while (i<=100);

        System.out.println("\n-----------------------------------");
        i=1;
        do {
            if(i<=5)
                System.out.print(i+" ");
            else
                System.out.printf("%d ",10-i);
            i++;
        }while (i<10);

        System.out.println("\n-----------------------------------");
        i=6;
        do {
            System.out.print(i+" ");
            i+=6;
        }while (i<=60);
        System.out.println("\n-----------------------------------");
    }
}
