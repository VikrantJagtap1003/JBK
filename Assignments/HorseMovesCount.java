package ClassCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HorseMovesCount {
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
        public static char[][] countMoves(int row,int column,Map<Integer,String> moves)
        {
            int count=1;
            int temprow=0;
            int tempcol=0;
            char[][] chess=new char[8][8];
            chess[row-1][column-1]='H';
            if(column-2>0&&row-1>0)
            {
                chess[row-1-1][column-2-1]='h';
                temprow=(row-1-1)+1;
                tempcol=(column-2-1)+1;
                moves.put(count++,temprow+","+tempcol);
            }
            if(column-2>0&&row+1<9)
            {
                chess[row][column-2-1]='h';
                temprow=row+1;
                tempcol=column-2-1+1;
                moves.put(count++,temprow+","+tempcol);
            }
            if(row-2>0&&column-1>0)
            {
                chess[row-2-1][column-1-1]='h';
                temprow=row-2-1+1;
                tempcol=column-1-1+1;
                moves.put(count++,temprow+","+tempcol);
            }
            if(row-2>0&&column+1<9)
            {
                chess[row-2-1][column]='h';
                temprow=row-2-1+1;
                tempcol=column+1;
                moves.put(count++,temprow+","+tempcol);
            }
            if(column+2<9&&row-1>0)
            {
                chess[row-1-1][column+1]='h';
                temprow=row-1-1+1;
                tempcol=column+1+1;
                moves.put(count++,temprow+","+tempcol);
            }
            if(column+2<9&&row+1<9)
            {
                chess[row][column+1]='h';
                temprow=row+1;
                tempcol=column+1+1;
                moves.put(count++,temprow+","+tempcol);
            }
            if(row+2<9&&column-1>0)
            {
                chess[row+1][column-1-1]='h';
                temprow=row+1+1;
                tempcol=column-1-1+1;
                moves.put(count++,temprow+","+tempcol);
            }
            if(row+2<9&&column+1<9)
            {
                chess[row+1][column]='h';
                temprow=row+1+1;
                tempcol=column+1;
                moves.put(count++,temprow+","+tempcol);
            }
            return chess;
        }
        public static void printChessBoard(char[][] arr)
        {
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {

            char[][] chess;
            Map<Integer,String> moves=new HashMap<>();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter initial positions..");

            int horse_one_row;
            int horse_one_column;

            horse_one_row=enterPosition(1,"row");
            horse_one_column=enterPosition(1,"column");


            chess=countMoves(horse_one_row,horse_one_column,moves);
            printChessBoard(chess);
            while(true)
            {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Enter 'yes' to move the horses..");
                System.out.println("Enter 'no' to exit");
                String str=sc.nextLine();
                if(str.equals("no"))
                {
                    System.out.println("\nHave a nice day :)");
                    break;
                }
                else if(str.equals("yes")){
                    for(int itr:moves.keySet())
                    {
                        System.out.println("Press "+itr+" key to go at "+moves.get(itr)+" position.");
                    }
                    int ipt=sc.nextInt();
                    sc.nextLine();
                    String ret=moves.get(ipt);
                    moves.clear();
                    chess=countMoves(Integer.parseInt(""+ret.charAt(0)),Integer.parseInt(""+ret.charAt(2)),moves);
                    printChessBoard(chess);
                }
            }


    }
}
