import java.util.Arrays;

class Solution2 {
    public static int[] sortedSquares(int[] A) {
        int[] b=new int[A.length];
        for(int i=0;i<A.length;i++){
            b[i]=A[i]*A[i];
        }
        Arrays.sort(b);
        return b;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(Arrays.toString(sortedSquares(a)));
    }
}