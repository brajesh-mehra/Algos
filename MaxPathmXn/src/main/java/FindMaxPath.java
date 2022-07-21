import java.util.List;

public class FindMaxPath {

    public static void findMaxPath(int[][] mat, int m, int n, int i, int j, List<Integer> list){
        // return if reached the last
        if(i > m || j > n) return;;
        list.add(mat[i][j]);

        if(i == m && j == n)
        {
            System.out.println(list);
        }

        findMaxPath(mat, m, n, i+1, j, list);
        findMaxPath(mat, m, n, i, j+1, list);

        //reset the list after each path prints
        list.remove(list.size() - 1);
    };
}
