public class Loan {

    static int loancalculate(int year, int rate, int amount) {
        return (amount * rate * year)/100;
    }
}
