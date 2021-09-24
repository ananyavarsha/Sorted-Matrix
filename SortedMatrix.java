
public class SortedMatrix {

    public void search(int[][] matrix, int n, int x) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                System.out.println("x found at position " + i + " " + j);
                return;
            }
            if (matrix[i][j] > x) {// if the given x is lesser than the matrix element then the x should be present
                                   // in previous columns
                j--;
            } else {// if greater then in the same column the value should be present so increment i
                i++;
            }
        }
        System.out.println("value not found");
    }

    public static void main(String[] args) {
        SortedMatrix sm = new SortedMatrix();
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 51 } };
        sm.search(matrix, 4, 32);
    }
}
