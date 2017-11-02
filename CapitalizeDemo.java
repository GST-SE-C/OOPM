import java.util.*;
import java.lang.*;

class Capital
{
        String a;

        Capital()
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("\nEnter a String\n");
                a = new String(sc.nextLine());
        }

        String makeFirstCapital()
        {
                //      -- CAPITALIZE FIRST CHARACTER --  +  -- REMAINS --
                return ((char) ((int)(a.charAt(0)) - 32)) + a.substring(1);
        }
}

class CapitalizeDemo
{
        public static void main(String args[])
        {
                Capital c = new Capital();
                System.out.println("New String : " + c.makeFirstCapital());
        }
}
