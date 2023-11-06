package buckwheat;

public class Buckwheat {
    private final int eatKgPerMonth = 6;
    private final int allAmountKg = 100;
    private final int paymentPerMonthForKg = 100;

    public int calculateMoney(int months) {
        int money = 0;
        int currentAmountKg = allAmountKg;
        for (int i = 1; i <= months; i++) {
            money = money + currentAmountKg * paymentPerMonthForKg;
            if (currentAmountKg < eatKgPerMonth) {
                System.out.println("Зерно закончилось на " + i + " месяце");
                break;
            }
            currentAmountKg = currentAmountKg - eatKgPerMonth;
        }
        System.out.println("Итого денег потрачено за " + months + " месяца: " + money);
        return money;
    }
}
