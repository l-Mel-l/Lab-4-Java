import java.util.Scanner;
public class Массивы_Лаб4 {
    public static void main(String[] args) {
        int sred_arif = 0;

        // Задаётся массив
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите значения массива");
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }

        //Находим среднее ариф.
        int otv = 0;
        for (int i = 0; i < n; i++) {
            sred_arif += mass[i];
            otv = sred_arif / n;
        }
        System.out.println("Среднее арифметическое = "+otv);

        //Находим минимальное

        int min = mass[0];
        for (int i:mass){
            if(i<min){
                min = i;
            }
        }
        System.out.println("Минимальное значение = "+min);

        int fin_otv = otv+min;
        System.out.println("Сумма минимального элемента и среднего арифметического = " + fin_otv);



        sc.close();
    }
}