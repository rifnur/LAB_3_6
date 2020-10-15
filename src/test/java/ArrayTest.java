import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ArrayTest {
    @Test
    public void shouldArray1(){
    boolean num =Array.massivAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Assertions.assertEquals(false,num);}
    @Test
    public void shouldArray2(){
        boolean num =Array.massivAll(Arrays.asList(1,4,1,4,1,4,1,4));
            Assertions.assertTrue(num, "В массиве есть 1 и 4"); }
    @Test
    public void shouldArray3(){
        boolean num =Array.massivAll(Arrays.asList(4,4,5,1,4,2,3,4));
        Assertions.assertTrue(num, "В массиве есть не только 1 и 4"); }

    @Test
    public void shouldArray4(){
        boolean num =Array.massivAll(Arrays.asList(4,4,4,4));
        Assertions.assertFalse(num, "В массиве есть 4"); }
}
