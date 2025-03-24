import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате “yyyy”");

        //while (true) {
            String input = scanner.nextLine();
            if (input.equals("enter")) {
                //break;
            }
            else {
                int year = Integer.parseInt(input);
                if(year%4==0 && year%100!=0) {
                    System.out.println("Количество дней 366");
                }
                else {
                    System.out.println("Количество дней 365");
                }
            }
        //}

    }
}