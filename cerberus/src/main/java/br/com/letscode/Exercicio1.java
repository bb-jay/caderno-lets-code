package br.com.letscode;

/**
 * Hello world!
 *
 */
public class Exercicio1 {
    public static void main(String[] args) {
        String userName = "José";
        double balance = 6569.28;
        double interestRate = 12.5;
        double bonus = 0;

        if (balance <= 0) {
            System.out.printf("O %s não irá receber nada", userName);
            return;
        }

        int intervaloDoBalanco = Math.min(
                (int) (balance / 1000) * 1000,
                5000);

        switch (intervaloDoBalanco) {

            case 5000:
                bonus += 50;

            case 4000:
                bonus += 50;

            case 3000:
                interestRate += 1;

            case 2000:
                interestRate += 1;

            case 1000:
                interestRate += 1;

            default:
                break;
        }

        System.out.println(interestRate);
        System.out.println(bonus);

        // System.out.printf("%s irá receber R$ %f", userName, interestRate / 100 * balance + bonus);
    }
}