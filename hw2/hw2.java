public class hw2 {
    public static void main(String[] args) {
        double[] m1 = new double[15];
        for (int i = 0; i < 15; i++) {
            m1[i] = Math.random();
            System.out.println(m1[i]);

        }
        double a = 0D;
        double b = 1D;
        double c = 0D;

        for (int i = 0; i < 15; i++) {
            if (m1[i] > a) {
                a = m1[i];
            }
            if (m1[i] < b) {
                b = m1[i];
            }
            c += m1[i];
        }
        c = c / m1.length;
        System.out.println("максимальное значение " + a);
        System.out.println("минимальное значение " + b);
        System.out.println("среднее значение " + c);
        bubbleSort(m1);
        for (int i = m1.length - 1; i >= 0; i--) {
            System.out.print(m1[i] + "   ");
        }

    }

    private static void bubbleSort(double[] arr) {
        for (int j = (arr.length - 1); j >= 0; j--)
            for (int i = 0; i < j; i++)
                if (arr[i] < arr[i + 1]) {
                    double tmp;
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
    }
}