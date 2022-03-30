public class Main {

    public static void main(String[] args) {

        int account = 1000; // объявляемая переменная для начального состояния баланса
        int deposit = 5000; // сумма пополнения счёта
        int summary = account + deposit; // количество денег на счёте после пополнения
        int bonus = deposit / 100; // расчёт бонусных рублей

        if (deposit >= 1000) {
            System.out.println("На вашем счету " + summary + " рублей. " + bonus + " из них бонусные.");
        } else {
            System.out.println("На вашем счету " + summary + " рублей.");
        }
    }
}
