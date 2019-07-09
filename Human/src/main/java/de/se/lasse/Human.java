package de.se.lasse;

/**
 * Hello world!
 *
 */
public class Human
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    boolean check(int groesse) {
        if(groesse < 180 && groesse > 120) {
            return true;
        } else {
            return false;
        }
    }
}
