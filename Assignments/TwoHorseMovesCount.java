package ClassCodes;

import java.util.*;

public class TwoHorseMovesCount {

        public static void makeZero(String[][] arr)
        {
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    arr[i][j]="";
                }
            }
        }
        public  static int enterPosition(int a,String str)
        {   int position;
            String message = "";
            while(true)
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Horse "+a+" "+str+" count "+message+"between 1 to 8");
                position = sc.nextInt();
                if(position<=8&&position>=1)
                {
                    break;
                }
                else{
                    System.out.println("You entered a wrong position..");
                    message="again ";
                }
            }
            return position;
        }
        public static String[][] countMoves(String horse1,String horse2,ArrayList<String> h_1_pos,ArrayList<String> h_2_pos,String[][] chess)
        {



            String[] arr1=horse1.split(",");
            int row1=Integer.parseInt(arr1[0]);
            int col1=Integer.parseInt(arr1[1]);

            String[] arr2=horse2.split(",");
            int row2=Integer.parseInt(arr2[0]);
            int col2=Integer.parseInt(arr2[1]);

            h_1_pos.clear();
            h_2_pos.clear();
            ArrayList<String> list=h_1_pos;
            int i=0;
            int row=row1;
            int col=col1;
            String app="1";
            while(i++<2)
            {
                if(i==2)
                {
                    row=row2;
                    col=col2;
                    app="2";
                    list=h_2_pos;
                }
                if(col-1>0&&row-2>0)
                {
                    chess[row-2-1][col-1-1]+=app;
                    list.add(row-2+","+(col-1));
                }
                if(col+1<9&&row-2>0)
                {
                    chess[row-2-1][col]+=app;
                    list.add(row-2+","+(col+1));
                }
                if(col+2<9&&row-1>0)
                {
                    chess[row-2][col+1]+=app;
                    list.add(row-1+","+(col+2));
                }
                if(col+2<9&&row+1<9)
                {
                    chess[row][col+1]+=app;
                    list.add(row+1+","+(col+2));
                }
                if(row+2<9&&col+1<9)
                {
                    chess[row+1][col]+=app;
                    list.add(row+2+","+(col+1));
                }
                if(row+2<9&&col-1>0)
                {
                    chess[row+1][col-2]+=app;
                    list.add(row+2+","+(col-1));
                }
                if(col-2>0&&row+1<9)
                {
                    chess[row][col-2-1]+=app;
                    list.add(row+1+","+(col-2));
                }
                if(col-2>0&&row-1>0)
                {
                    chess[row-2][col-2-1]+=app;
                    list.add(row-1+","+(col-2));
                }
                chess[row-1][col-1]="H"+i;

            }
            return chess;
        }
        public static void printChessBoard(String[][] arr)
        {
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    String str=arr[i][j];
                    if(arr[i][j]=="")
                    {
                        str="-";
                    }
                    System.out.print(String.format("%4s",str));
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {

            ArrayList<String> h_1_pos=new ArrayList<>();
            ArrayList<String> h_2_pos=new ArrayList<>();
            String[][] chess = new String[8][8];
            makeZero(chess);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter initial positions..");
            int horse_one_row;
            int horse_one_column;
            int horse_two_row;
            int horse_two_column;
            boolean checker = true;
            //for first Horse Initial Positions...
            horse_one_row = enterPosition(1, "row");
            horse_one_column = enterPosition(1, "column");

            //for second Horse Initial Positions...
            horse_two_row = enterPosition(2, "row");
            horse_two_column = enterPosition(2, "column");

            String h1_position=horse_one_row+","+horse_one_column;
            String h2_position=horse_two_row+","+horse_two_column;
            while(true)
            {

                if(horse_one_row==horse_two_row && horse_one_column==horse_two_column)
                {
                    checker=false;
                    System.out.println("You entered same position for both horses..");
                    System.out.println( "Please enter 1 to change position of 1st horse..");
                    System.out.println( "Please enter 2 to change position of 1st horse..");
                    int p=sc.nextInt();
                    if(p==1||p==2)
                    {
                        if(p==1)
                        {
                            horse_one_row=enterPosition(1,"row");
                            horse_one_column=enterPosition(1,"column");
                        }
                        else {
                            horse_two_row=enterPosition(2,"row");
                            horse_two_column=enterPosition(2,"column");
                        }
                    }
                }
                else {
                    break;
                }
            }
            if(!checker)
            {
                sc.nextLine();
            }
            chess=countMoves(h1_position,h2_position,h_1_pos,h_2_pos,chess);
            printChessBoard(chess);
            while(true)
            {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Enter 'yes' to go to next position..");
                System.out.println("Enter 'no' to exit");
                String str=sc.nextLine();
                if(str.equals("no"))
                {
                    System.out.println("\nHave a nice day :)");
                    break;
                }
                else if(str.equals("yes")){
                    int next;
                    while(true)
                    {
                        System.out.println("Press 1 to move horse 1 \npress 2 to move horse 2");
                        next=sc.nextInt();
                        if(next==1||next==2)
                        {
                            break;
                        }
                    }
                    int poi=1;
                    if(next==1)
                    {
                        for(String s:h_1_pos)
                        {
                            System.out.println("press "+poi+" to go at "+s+" Position.");
                            poi++;
                        }
                        while(true)
                        {
                            next=sc.nextInt();
                            if(next<poi)
                            {
                                break;
                            }
                            else{
                                System.out.println("Please select a proper position..");
                            }
                        }
                        h1_position=h_1_pos.get(next-1);

                    }
                    else{
                        for(String s:h_2_pos)
                        {
                            System.out.println("press "+poi+" to go at "+s+" Position.");
                            poi++;
                        }
                        while(true)
                        {
                            next=sc.nextInt();
                            if(next<poi)
                            {
                                break;
                            }
                            else{
                                System.out.println("Please select a proper position..");
                            }
                        }
                        h2_position=h_2_pos.get(next-1);
                    }
                    makeZero(chess);
                    chess=countMoves(h1_position,h2_position,h_1_pos,h_2_pos,chess);
                    printChessBoard(chess);
                    sc.nextLine();
                }
            }
    }
}
