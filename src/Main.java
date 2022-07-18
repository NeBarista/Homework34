public class Main {
    public static void main(String[] args) {
        System.out.println(countNum(4, new int[] {2, 4, 3, 4}));
        System.out.println(countNum(6, new int[] {-2, -4, 3, 4}));
        System.out.println(countNum(39, new int[] {2, 4, -3, -4}));
        System.out.println(countNum(1, new int[] {}));
    }
    public static int countNum(int number, int [] array) {
        int count = 0;
        if (array.length <1) {
            System.out.println("array is empty");
            count = -1;
        } else {
            for (int num : array) {
                if (num == number) {
                    count++;
                }
            }
        }
        return count;
    }
}