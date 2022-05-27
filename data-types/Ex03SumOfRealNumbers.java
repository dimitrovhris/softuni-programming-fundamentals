import java.math.BigDecimal;
import java.util.Scanner;

public class Ex03SumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for(int i = 1; i <= n; i++){
            BigDecimal currentNum = new BigDecimal(sc.nextLine());
            sum = sum.add(currentNum);
        }
        System.out.println(sum);
    }
}
