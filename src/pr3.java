public class pr3 {
    public static void main(String[] args) {

        int ar1[] = new int[5];
        int ar2[] = new int[5];
        int ar3[] = new int[5];
        double result = 0;
        double result1 = 0;
        double result2 = 0;
        double mid1 = 0, mid2 = 0;
        for (int i = 0; i < 5; i++) {
            ar1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + ar1[i];
            System.out.print(ar1[i] + " ");
        }
        for (double d : ar1) {
            result += d;
        }
        System.out.println("Серед. арефметичне " + result / ar1.length);


        System.out.println();
        for (int i = 0; i < 5; i++) {
            ar2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + ar2[i];
            System.out.print(ar2[i] + " ");


        }
        for (double c : ar2) {
            result2 += c;
        }
        System.out.println("Серед. арефметичне " + result2 / ar2.length);


        System.out.println();
        for (int i = 0; i < 5; i++) {
            ar3[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + ar3[i];
            System.out.print(ar3[i] + " ");

        }


        for (double s : ar1) {
            result1 += s;
        }
        System.out.println("Серед. арефметичне " + result1 / ar1.length);
    }
}
