public class Main {
    public static void main(String[] args) {
        int amountAccount = 200; //
        int refillAmount = 1500;
        int bonus;
        int totalAmount;

        if (refillAmount > 1000) {
            bonus = (refillAmount * 1 / 100);
            totalAmount = amountAccount + refillAmount + bonus;
            System.out.println("Зачислено бонусных" + bonus + "руб.");
            System.out.println("На Вашем балансе" + totalAmount + "руб.");
        } else {
            bonus = 0;
            System.out.println("Бонусные рубли не зачислены. Чтобы получить бонусные рубли пополните баланс на сумму более 1000 руб.");
        }


    }
}
