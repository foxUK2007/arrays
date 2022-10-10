public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");
        System.out.println();

        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int index = 0; index < firstArray.length; index++) {
            if (index < firstArray.length - 1) {
                System.out.print(firstArray[index] + ", ");
            }
            if (index == firstArray.length - 1) {
                System.out.print(firstArray[index]);
            }

        }
        System.out.println();

        double[] nextArray = {1.57, 7.654, 9.986};
        for (int index1 = 0; index1 < nextArray.length; index1++) {
            if (index1 < nextArray.length - 1) {
                System.out.print(nextArray[index1] + ", ");
            }
            if (index1 == nextArray.length - 1) {
                System.out.print(nextArray[index1]);
            }

        }
        System.out.println();

        int[] myArray = {111, 777, 999, 555, 333};
        for (int index2 = 0; index2 < myArray.length; index2++) {
            if (index2 < myArray.length - 1) {
                System.out.print(myArray[index2] + ", ");
            }
            if (index2 == myArray.length - 1) {
                System.out.print(myArray[index2]);
            }

        }
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int[] firstArrayTask3 = new int[3];
        firstArrayTask3[0] = 1;
        firstArrayTask3[1] = 2;
        firstArrayTask3[2] = 3;
        for (int index3 = firstArrayTask3.length - 1; index3 >= 0; index3--) {
            if (index3 > 0) {
                System.out.print(firstArrayTask3[index3] + ", ");
            }
            if (index3 == 0) {
                System.out.print(firstArrayTask3[index3]);
            }

        }
        System.out.println();

        double[] nextArrayTask3 = {1.57, 7.654, 9.986};
        for (int index4 = nextArrayTask3.length - 1; index4 >= 0; index4--) {
            if (index4 > 0) {
                System.out.print(nextArrayTask3[index4] + ", ");
            }
            if (index4 == 0) {
                System.out.print(nextArrayTask3[index4]);
            }
        }
        System.out.println();

        int[] arrayTask3 = {111, 777, 999, 555, 333};
        for (int index5 = arrayTask3.length - 1; index5 >= 0; index5--) {
            if (index5 > 0) {
                System.out.print(arrayTask3[index5] + ", ");
            }
            if (index5 == 0) {
                System.out.print(arrayTask3[index5]);
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        int[] firstArrayTask4 = new int[3];
        firstArrayTask4[0] = 1;
        firstArrayTask4[1] = 2;
        firstArrayTask4[2] = 3;
        for (int index6 = 0; index6 < firstArrayTask4.length; index6++) {
            if (firstArrayTask4[index6] % 2 == 0) {
                System.out.println();
                System.out.print(firstArrayTask4[index6] + " ");
            } else {
                firstArrayTask4[index6] += 1;
                System.out.print(firstArrayTask4[index6] + " ");
            }
        }
        System.out.println();
    }
}




