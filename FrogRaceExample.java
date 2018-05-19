public class FrogRaceExample
{
    
    public static void main(String[] args) throws InterruptedException
    {
        
        int totSpace = 0;
        do
        {
            drawSpaces(totSpace);
            System.out.println(">");
            drawSpaces(totSpace);
            System.out.println(">");
            
            
            totSpace = totSpace + 1;
            
            
            Thread.sleep(100);
            
            clear();
            
        }
        while (totSpace < 100);
        
        
    }
    
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

/*
 ($1)-($1)
 /_______\
 \_______/
 
 ($2)-($2)
 /_______\
 \_______/
 
 
 */