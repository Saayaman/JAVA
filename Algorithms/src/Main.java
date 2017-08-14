import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ayako_sayama on 2017-06-26.
 */

public class Main extends Component {

    public static void main(String[] args) {

        int[] nums = {1,2,3,5,6,7,8};
        int target = 7;

        System.out.println(twoSum(nums, target));

        Lesson1 lesson1 = new Lesson1();
        lesson1.add("Rice");
        lesson1.add("bread");
        lesson1.add("cous cous");
        System.out.println(lesson1.myList);

        String newList[] = new String[0];
    newList[0] = "corn";
    newList = lesson1.myList.toArray(newList);

        System.out.println(newList);
}


    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                System.out.println("Result: " + result[0] + ", " + result[1]);

                return result;
            }
            System.out.println(numbers[i] + ", " + i + 1);
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}