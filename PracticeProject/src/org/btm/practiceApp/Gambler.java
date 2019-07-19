package org.btm.practiceApp;
public class Gambler 
{ 

    public static void main(String args[]) 
    {
        int stake=Integer.parseInt(args[0]);// Gambler's stating bankroll
        int goal=Integer.parseInt(args[1]);// Gambler's desired bankroll
        int trials=Integer.parseInt(args[2]);// Number of trials to perform

        int bets=0;//Total number of bets made
        int wins=0;//Total number of games won

        //Repeat trials times
        for (int t=0;t<trials;t++) 
        {
            //Do one gambler's ruin simulation
            int cash=stake;
            while (cash>0 && cash<goal) 
            {
                bets++;
                if (Math.random()<0.5) 
                	cash++;//Win $1
                else  
                	cash--;//Lose $1
            }
            if (cash == goal) 
            	wins++;//Did gambler go achieve desired goal?
        }

        //Print results
        System.out.println(wins+" wins of "+trials);
        System.out.println("Percent of games won = "+100.0*wins/trials);
        System.out.println("Avg # bets           = "+1.0*bets/trials);
    }

}