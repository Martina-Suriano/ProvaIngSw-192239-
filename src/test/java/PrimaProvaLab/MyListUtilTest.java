package PrimaProvaLab;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MyListUtilTest 
{
    private static MyListUtil list;
    
    @BeforeClass
    public static void prepare() {
    	list= new MyListUtil();
    }
    
    @Test
    public void orderWorks() {
    	int [] arr= {3,2,5,4,1};
    	assertEquals(Arrays.asList(1,2,3,4,5), list.orderNumber(arr));
    	
    }
}
