/*
 Name: Angel Pajimola
 Date: 050418
 Block: 4e
 Project: FrogRace
 Purpose: race two frogs // with ascii modifications
 */

import cs1.Keyboard;

public class FrogRace
{
    public static void main(String[] args) throws InterruptedException
    {
        // variables
        String froggo1, froggo2;
        boolean cheerNah1,cheerNah2, winna1 = false, winna2 = false;
        int f1Jump = 0, f2Jump = 0, toJump1 = 0, toJump2 = 0;
                
        // user starting menu to setup frogs
        System.out.println("Let's have a Frog Race!");
        
        System.out.println("What is the name of the first froggo?");
        froggo1 = Keyboard.readString();
        System.out.println("What is the name of the second froggo?");
        froggo2 = Keyboard.readString();
        
        Frog froggie1 = new Frog(froggo1);
        Frog froggie2 = new Frog(froggo2);
                
        froggie1.getFrogStrength();
        froggie2.getFrogStrength();
        
        froggie1.getFrogCheerAdvantage();
        froggie2.getFrogCheerAdvantage();
        
        System.out.println(froggie1.toString());
        System.out.println(froggie2.toString());
        
        // ask user if they would like to cheer
        System.out.println("Do you want to cheer for " + froggo1 + " (True/False)?");
        cheerNah1 = Keyboard.readBoolean();
        
        System.out.println("Do you want to cheer for " + froggo2 + " (True/False)?");
        cheerNah2 = Keyboard.readBoolean();
        
        System.out.println(froggie1.toString());
        System.out.println(froggie2.toString());
        
        // play the game
        do
        {
            froggie1.jump(cheerNah1);
            f1Jump = froggie1.jump(cheerNah1);
            
            if (f1Jump == 0)
            {
                System.out.println(froggo1 + " went 0 inches forward");
                froggie1.toString();
            }
            else if (f1Jump < 0)
            {
                System.out.println(froggo1 + " went " + f1Jump + " inches backwards.");
                froggie1.toString();
            }
            else if (f1Jump > 0)
            {
                System.out.println(froggo1 + " went " + f1Jump + " inches forward.");
                froggie1.toString();
            }
            
            toJump1 = toJump1 + f1Jump;
            
            froggie2.jump(cheerNah2);
            f2Jump = froggie2.jump(cheerNah2);
            if (f2Jump == 0)
            {
                System.out.println(froggo2 + " went 0 inches forward");
                froggie2.toString();
                System.out.println();
            }
            else if (f2Jump < 0)
            {
                System.out.println(froggo2 + " went " + f2Jump + " inches backwards.");
                froggie2.toString();
                System.out.println();
            }
            else if (f2Jump > 0)
            {
                System.out.println(froggo2 + " went " + f2Jump + " inches forward.");
                froggie2.toString();
                System.out.println();
            }
            
            toJump2 = toJump2 + f2Jump;
            
            
            drawSpaces(toJump1);
            System.out.println("($1)-($1)");
            drawSpaces(toJump1);
            System.out.println("/_______\\");
            drawSpaces(toJump1);
            System.out.println("\\_______/");
            drawSpaces(toJump2);
            System.out.println("($2)-($2)");
            drawSpaces(toJump2);
            System.out.println("/_______\\");
            drawSpaces(toJump2);
            System.out.println("\\_______/");
            //toJump = totSpace + 1;
            
            Thread.sleep(100);
            
            clear();
            
            
             System.out.println(froggo1 + " has jumped a total of " + toJump1 + " inches.");
             System.out.println(froggo2 + " has jumped a total of " + toJump2 + " inches.\n");
             
            
            if (toJump1 >= 96 && toJump2 >= 96)
            {
                winna1 = true;
                winna2 = true;
            }
            else if (toJump1 >= 96 && toJump2 < 96)
            {
                winna1 = true;
                winna2 = false;
            }
            else if (toJump1 < 96 && toJump2 >= 96)
            {
                winna1 = false;
                winna2 = true;
            }
        }
        while(toJump1 < 96 && toJump2 < 96);
        
        if (winna1 == true && winna2 == true)
        {
            System.out.println("Both froggos are winnas!");
            System.out.println(froggie1.toString());
            System.out.println(froggie2.toString());
        }
        else if (winna1 == true && winna2 == false)
        {
            System.out.println("The winna is " + froggo1 + "!");
            System.out.println(froggie1.toString());
        }
        else if (winna1 == false && winna2 == true)
        {
            System.out.println("The winna is " + froggo2 + "!");
            System.out.println(froggie2.toString());
        }
        
    }
    
    ////////////////////////////////////////////
    //////        HELPER METHODS     ///////////
    ////////////////////////////////////////////
    public static void drawSpaces(int numSpaces)
    {
        for (int i=1; i<numSpaces; i++)
        {
            System.out.print(" ");
        }
    }
    
    public static void clear()
    {
        for (int i=1; i<22; i++)
        {
            System.out.println("");
        }
    }
}