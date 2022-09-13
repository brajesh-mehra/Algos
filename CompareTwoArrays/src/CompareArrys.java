import java.util.HashSet;
import java.util.Set;

public class CompareArrys {

    private static boolean compareTwoArrays(char[] arr1, char[] arr2){
        if(arr1.length == 0 && arr2.length == 0) return false;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }
        System.out.println(set);
        for(int i = 0; i < arr2.length; i++)
        {
            if(set.contains(arr2[i]))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Compare two Arrays in optimized way");

        char[] arr1 = {'a', 'a', 'b' , 'd', 'a'};
        char[] arr2 = {'e', 'a'};
        System.out.println("Is value exist ="+ compareTwoArrays(arr1, arr2));
    }
}
