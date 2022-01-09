public class Main {

    public static void main(String[] args) {
        int account = 100; // остаток на счете
        int payments = 800; // сумма пополнения
        int bonus = payments / 100; // бонус за каждые 100 рублей
        int totalAccount = account + payments;

        if (payments >= 1000) {
            System.out.println("Вам начислено бонусов" + bonus);

        } else {
            System.out.println("Вам не начислено бонусов" );
        }
    }
}

