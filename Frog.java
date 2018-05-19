/*
 Name: Angel Pajimola
 Date: 050418
 Block: 4e
 Project: Frog
 Purpose: make a frog
 */

import java.util.Random;
import cs1.Keyboard;

public class Frog
{
    private String frogName;
    private int maxDistJump, maxDistCEJ, mRJump;
    
    public Frog(String theFrogName)
    {
        frogName = theFrogName;
        
        Random makeJump = new Random();
        maxDistJump = makeJump.nextInt(8 - 3 + 1) + 3;
        
        Random makeJump2 = new Random();
        maxDistCEJ = (makeJump2.nextInt(5 - 1 + 1) + 1) + maxDistJump;
        
    }
    
    public int getFrogStrength()
    {
        return maxDistJump;
    }
    
    public int getFrogCheerAdvantage()
    {
        return maxDistCEJ;
    }
    
    public int jump(boolean cheer)
    {
        int theJump;
        
        Random showTheJump = new Random();
        
        if (cheer == true)
        {
            theJump = (showTheJump.nextInt(maxDistCEJ - -3 + 1) + 1);
        }
        else
        {
            theJump = showTheJump.nextInt(maxDistJump - 0 + 1) + 1;
        }
        
        return theJump;
    }
    
    public String getFrogName()
    {
        frogName = Keyboard.readString();
        
        return frogName;
    }
    
    public String toString()
    {
        String result;
        
        result = "\nFrog Name: " + frogName + "\n";
        result += "Maximum Distance Frog Can Jump: " + maxDistJump + "\n";
        result += "Maximum Distance Frog Can Jump With Cheer: " + maxDistCEJ + "\n";
        
        return result;
    }
}