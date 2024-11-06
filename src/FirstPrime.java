import java.util.Scanner;

public class FirstPrime {
    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0, n = 2;
        System.out.print("Nhap so luong so nguyen to can in ra: ");
        number = sc.nextInt();

        //Kiem tra va in ra snt
        System.out.println("Cac so nguyen to: ");
        while (count < number) {
            if(isPrime(n)) {
                System.out.print(n+" ");
                count++;
            }
            //Tang n de kiem tra so tiep theo
            n++;
        }
    }
}
