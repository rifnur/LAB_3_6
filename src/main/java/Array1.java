import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        int[] res2 = massivAll(new int[]{1 ,2 ,4 ,4 ,2 ,3 ,4 ,1 ,7});
//        int[] res2 = massivAll(new int[]{1 ,2 ,1 ,7});
        System.out.println(Arrays.toString(res2));
    }

    public static int[] massivAll(int[] massiv) {

        if(massiv.length == 0) {
            return massiv;
        }
        for (int i = massiv.length-1; i >= 0 ; i--) {
            if(massiv[i] == 4) {
                int num = massiv.length-1-i;
                int[] newArr = new int[num];
                System.arraycopy(massiv, (i+1), newArr,0,num);
                return newArr;
            }
        }
        throw new RuntimeException("В массиве нет цифры 4");
    }
}