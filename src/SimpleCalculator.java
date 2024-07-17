
public class SimpleCalculator {

    public static void main(String[] args) {

    }
    private double firstNumber;
    private double secondNumber;

    public double getfirstNumber() {
        return firstNumber;
    }

    public double getsecondNumber() {
        return secondNumber;
    }

    public void setfirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }

    public void setsecondNumber(double secondNumber){
        this.secondNumber =secondNumber;
    }

    public double getAdditionalResult() {
        double AdditionalResult=firstNumber+secondNumber;
        return AdditionalResult;
    }

    public double getsubtractionResult() {
        double subtractionResult=firstNumber-secondNumber;
        return subtractionResult;
    }

    public double  getMultiplicationResult() {
        double multiplicationResult=firstNumber*secondNumber;
        return multiplicationResult;
    }

    public double getdivisionalResult() {
        if(secondNumber==0 || firstNumber ==0) {
            return 0;
        } else {
            double divisionResult = firstNumber / secondNumber;
            return divisionResult;

        }
    }
}