public class pr4 {
    public static void main(String[] args) {
        int ar9[] = new int[10];
        int ar8[] = new int[10];
        double mid1 = 0, mid2 = 0;
        for (int i = 0; i < 10; i++) {
            ar9[i] = (int) Math.round(Math.random() * 10);
            mid1 = mid1 + ar9[i];
            System.out.print(ar9[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            ar8[i] = (int) Math.round(Math.random() * 10);
            mid2 = mid2 + ar8[i];
            System.out.print(ar8[i] + " ");
        }

    }
}