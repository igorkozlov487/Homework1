import java.util.Scanner;

public class DZ {
        public static void main (String[] args)
    {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        if (input.hasNextInt()) {
            n = input.nextInt();
            System.out.println(isTriangular(n));
        } else {
            System.out.println("Вы ввели не целое число");
        }
        input.close();
    }
    
    static int isTriangular(int n)
    {
        int sum = 0;
        while (n > 0) 
        {
            sum += n;
            n--;            
        }
        return sum;
    }
}
