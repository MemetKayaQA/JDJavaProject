import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public static void main(String[] args) {

        int[] number={2,7,17,12};
        int target=9;
        System.out.println(Arrays.toString(twoSum(number,target)));

    }

    public static int[] twoSum(int[] arrays,int target) {

        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arrays.length ; i++) {

            int difference=target-arrays[i];

            if( map.containsKey(difference)){

                result[0]=map.get(difference);
                result[1]=i;
                break;
            }

            map.put(arrays[i],i);

        }
        return result;



    }



}
