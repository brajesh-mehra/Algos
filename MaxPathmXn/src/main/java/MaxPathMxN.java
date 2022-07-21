import java.util.ArrayList;
import java.util.List;

public class MaxPathMxN {

    public static void main(String[] args)
    {
        System.out.println("Find maximum path from an mXn matrix");

        //setup
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
            };
//        int[][] mat = {
//                {1,2},
//                {3,4},
//        };
        List<Integer> list = new ArrayList<>();

        int m = mat.length, n = mat[0].length;

        FindMaxPath.findMaxPath(mat, m-1, n-1, 0, 0, list);
    }
}
