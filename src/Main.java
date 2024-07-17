public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setfirstNumber(5.25);
        simpleCalculator.setsecondNumber(0);
        System.out.println(simpleCalculator.getfirstNumber());
        System.out.println(simpleCalculator.getsecondNumber());
        System.out.println(simpleCalculator.getAdditionalResult());
        simpleCalculator.setfirstNumber(-1.67);
        simpleCalculator.setsecondNumber(-1.67);
        System.out.println("subtraction =" +simpleCalculator.getsubtractionResult());
        
        System.out.println(simpleCalculator.getMultiplicationResult());
        System.out.println(simpleCalculator.getdivisionalResult());



    }
}