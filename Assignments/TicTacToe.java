package ClassCodes;

import java.util.*;

public class TicTacToe {
    public static Map<Integer,String> updateMoves()
    {
        Map<Integer,String> Moves=new HashMap<>();
        Moves.put(1,"Top-Left");
        Moves.put(2,"Top-Mid");
        Moves.put(3,"Top-Right");
        Moves.put(4,"Mid-Left");
        Moves.put(5,"Mid");
        Moves.put(6,"Mid-Right");
        Moves.put(7,"Bottom-Left");
        Moves.put(8,"Bottom-Mid");
        Moves.put(9,"Bottom-Right");
        return Moves;
    }
    public static void Update(Map<Integer,String> moves,int myMove,char[][] arr,boolean player)
    {
        char c = (player) ? 'O' : 'X';
        int row;
        int column;
        if(myMove%3==0)
        {
            row=(myMove/3)-1;
            column=2;
        }
        else{
            row=(myMove/3);
            column=(myMove%3)-1;
        }
        arr[row][column]=c;
        moves.remove(myMove);
    }
    public static int check(char[][] arr)
    {
        int r=0;
//        rowzzs
        for(int i=0;i<3;i++)
        {
            if((arr[i][0]=='O'&&arr[i][1]=='O'&&arr[i][2]=='O')||(arr[i][0]=='X'&&arr[i][1]=='X'&&arr[i][2]=='X'))
            {
                r=(arr[i][0]=='O')?1:2;
                return r;
            }
        }
//        column
        for(int i=0;i<3;i++)
        {
            if((arr[0][i]=='O'&&arr[1][i]=='O'&&arr[2][i]=='O')||(arr[0][i]=='X'&&arr[1][i]=='X'&&arr[2][i]=='X'))
            {
                r=(arr[0][i]=='O')?1:2;
                return r;
            }
        }
//        diagonal
        if((arr[0][0]=='O'&&arr[1][1]=='O'&&arr[2][2]=='O')||(arr[0][0]=='X'&&arr[1][1]=='X'&&arr[2][2]=='X'))
        {
            r=(arr[0][0]=='O')?1:2;
        } else if ((arr[0][2]=='X'&&arr[1][1]=='X'&&arr[2][0]=='X')||(arr[0][2]=='O'&&arr[1][1]=='O'&&arr[2][0]=='O')) {
            r=(arr[1][1]=='O')?1:2;
        }
        return r;
    }
    public static void print(char[][] arr)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map<Integer,String> Moves=updateMoves();

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your Names..");

        System.out.println("Input Player One->(he/she will get O as symbol)");
        String one=sc.nextLine();

        System.out.println("Input Player Two->(he/she will get X as symbol)");
        String two=sc.nextLine();

        char[][] arr=new char[3][3];
        boolean changer=true;
        int ans;

        for(int i=0;i<9;i++)
        {
            System.out.println(".....Moves available....");
            for(int itr:Moves.keySet())
            {
                System.out.println("For "+Moves.get(itr)+" press -> "+itr);
            }
            System.out.println("\n");
            if(changer)
            {
                System.out.println(one+" please make a move..");
                changer=false;
            }
            else {
                System.out.println(two+" please make a move..");
                changer=true;
            }
            int p=sc.nextInt();
            Update(Moves,p,arr,!changer);
            print(arr);
            System.out.println("--------------------------------------------------------------------------------\n");
            int c=check(arr);
            System.out.println(c);
            if(c!=0)
            {
                break;
            }
        }
         ans=check(arr);
        if(ans==0)
        {
            System.out.println("It's a tie..\n lets have a rematch :)");
        }
        else if(ans==1)
        {
            System.out.println("Sorry :( "+two+"\n"+one+" wins the game..");
        }
        else if(ans==2)
        {
            System.out.println("Sorry :( "+one +"\n"+two+" wins the game");
        }
    }
}
