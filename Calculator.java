class Calculate{
    public int add(int a, int b){
    return a+b; 
    }
    public int sub(int a, int b){
        return a-b;
    }
}
public class Calculator{
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println("Addition is: " + calc.add(10,20));
        System.out.println("Substraction is: "+calc.sub(50, 20));
    }
}