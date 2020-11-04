package PrimaProvaLab;

import org.joda.time.DateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int [] arr= {20,17,1,4,5};
        MyListUtil list= new MyListUtil();
        System.out.println(list.orderNumber(arr));
        DateTime date= new DateTime(2020, 11, 4, 12, 31, 0);
        System.out.println(date);
        
    }
}
