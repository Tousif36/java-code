class Calculate{
    public int add(int a, int b){
    return a+b; 
    }
}
public class Calculator{
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println("Result is: " + calc.add(10,20));
    }
}