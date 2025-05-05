public class CompoundInterest
{
    public static void main(String[] args){
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] interestRate = new double[NRATES];
        for(int i = 0; i < interestRate.length; i++){
            interestRate[i] = (STARTRATE + i) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];

        for(int i = 0; i < balances[0].length; i++){
            balances[0][i] = 10000;
        }

        for(int i = 1; i < balances.length; i++){
            for(int j = 0; j < balances[i].length; j++){
                balances[i][j] = balances[i - 1][j] + balances[i - 1][j] * interestRate[j];
            }
        }

        for(int j = 0; j < interestRate.length; j++){
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();

        for(double[] row : balances){
            for(double b : row){
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}