public class pr2 {
    public static void main(String[] args) {
        int ar[] = new int[20];
        for (int i = 0; i < 20; i++) {
            ar[i] = (int) Math.round(Math.random() * 9);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(ar[i] + " ");
        }

    }

}

