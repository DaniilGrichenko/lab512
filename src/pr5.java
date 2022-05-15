public class pr5 {
    public static void main(String[] args) {
        int[] arr1 = new int[15];
        int y = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ((int) (Math.random() * 15));
            if (arr1[i] == 2 || arr1[i] == 4 || arr1[i] == 6 || arr1[i] == 8 || arr1[i] == 10 || arr1[i] == 12 || arr1[i] == 14) {
                y++;
            }

            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print(y);
    }
}
