public class Main {
    public static void main(String[] args) {

        int startMoney = 100;
        int purchased = 1100;
        if (purchased > 1000) {
            System.out.println("Бонусов начислено:");
            System.out.println(purchased / 100);
            System.out.println("Итоговый баланс:");
            System.out.println(purchased / 100 + startMoney + purchased);// Объявляете переменные для входных данных и
        } else {
            System.out.println("Ваш баланс:");
            System.out.println(startMoney + purchased);// параметров программы: начального счёта,
        }
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}