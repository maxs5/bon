public class Main {

    public static void main(String[] args) {
        int account = 100; // остаток на счете
        int payments = 2000; // сумма пополнения
        int bonus = payments / 100; // бонус за каждые 100 рублей
        int totalAccount = account + payments;

        if (payments >= 1000) {
            System.out.println("Остаток на вашем счете:" + bonus);

        } else {
            System.out.println("Остаток на вашем счете" + payments + bonus + account + "рублей");
        }
    }
}

