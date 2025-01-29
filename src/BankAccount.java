public class BankAccount{
    public static void main(String[] ags){
        double balance = 2175.37;
        balance -= 302.50;
        balance += 50.03;
        balance /= 2;
        balance += 20.00;
        balance -= 1;
        balance *= 2;
        balance += 1;
        System.out.println(String.format("%.2f", balance));
    }
}
