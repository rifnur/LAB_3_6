import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        final boolean res0 = massivAll(Arrays.asList(4,4,4,4));
        final boolean res1 = massivAll(Arrays.asList(1, 4, 4,1,1,4,3));
        final boolean res2 = massivAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        final boolean res3 = massivAll(Arrays.asList(1, 4, 1, 4, 1, 4, 1, 4));
        System.out.println("res0 "+res0+"\n"+"res1 "+res1+"\n"+"res2 "+res2+"\n"+"res3 "+res3);
    }

    public static boolean massivAll (List<Integer> numbers){
        boolean one = false;
        boolean four = false;
        boolean num = true;


            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) != 1 && numbers.get(i) != 4 ){ num = false;}
                if (numbers.get(i) == 1) {one = true;}
                if (numbers.get(i) == 4) {four = true;}
            }return one&&four&&num;
        }
}
