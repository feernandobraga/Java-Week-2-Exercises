public class CompoundInterest {

    public static void main(String[] args) {
        double amount;
        double presentValue = 5000;
        double interestRate = 0.04;
        int timePeriods = 10;
        amount = presentValue * Math.pow((1 + interestRate), timePeriods);

        // I've used printf so it will format the double with only 4 decimal points
        System.out.printf("The final amount is: $%.4f", amount);

    }

}
