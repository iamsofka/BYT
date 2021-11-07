package Calculator;

public class MultiplyHandler extends Handler{
    @Override
    public void HandleRequest(double a, double b, String operator) {
        if (operator.equals("*")){
            System.out.println(a*b);
        }
        else {
            if (this.successor != null){
                this.successor.HandleRequest(a, b, operator);
            } else {
                System.out.println("Error. Wrong operator");
            }
        }
    }
}
