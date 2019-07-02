import java.util.Scanner;
import java.util.function.DoublePredicate;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sectors = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());

        double totalIncome = capacity * ticketPrice;
        double incomePerSector = totalIncome / sectors;
        double charity = (totalIncome - (incomePerSector * 0.75)) / 8;
        System.out.printf("Total income - %.2f BGN%nMoney for charity - %.2f BGN", totalIncome, charity);
    }
}
