package TimeComplexity;

public class BigONotations {
    public static void main(String[] args) {

        int a[] = {3, 7, 1, 7, 23, 5};
//        int key = 10;

        printAllPairsInAnArray(a);

    }

    //O(1)
    static int getFirstNumber(int a[]) {
        return a[0];
    }

    //O(n)
    static boolean checkIfNumberIsPresent(int a[], int key) {
        for(int element: a) {
            if(element == key) return true;
        }
        return false;
    }

    //O(n^2)
    static void printAllPairsInAnArray(int a[]) {
        int n = a.length;
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                System.out.println(a[i] + " " + a[j]);
            }
        }
    }

}
