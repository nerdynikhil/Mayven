package tech.nerdynikhil.Mayven;

import java.lang.module.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Initialized..." );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
    }
}
