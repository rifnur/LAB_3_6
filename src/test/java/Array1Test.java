
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Array1Test {
    @Test
    public void shouldArray1(){
        int[] num =Array1.massivAll(new int[]{1 ,2 ,4 ,4 ,2 ,3 ,4 ,1 ,7});
        Assertions.assertArrayEquals(new int[]{1 ,7},num,"тест не пройден");}
    @Test
    public void shouldArray2(){
        int[] num =Array1.massivAll(new int[]{5 ,5 ,4 ,4 ,1 ,4 ,5 ,1 ,7});
        Assertions.assertArrayEquals(new int[]{5 ,1 ,7},num,"тест не пройден");}
    @Test
    public void shouldArray3(){
        int[] num =Array1.massivAll(new int[]{7 ,8 ,3 ,1 ,2 ,3 ,5 ,4 ,8});
        Assertions.assertArrayEquals(new int[]{8},num,"тест не пройден");}
    @Test
    public void shouldArray4(){
        int[] num =Array1.massivAll(new int[]{4,4,4,4});
        Assertions.assertArrayEquals(new int[]{},num,"тест не пройден");}
}