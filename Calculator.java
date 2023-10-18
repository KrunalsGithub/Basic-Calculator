public class Calculator {

public Calculator(){

}

public int add(int a, int b){
  return a + b; //adds two integers
}

public int subtract(int a, int b){ 
  return a - b; //subtracts one integer from another
}

public int multiply(int a, int b){
  return a * b; //multiplies two integers
}

public int divide(int a, int b){
  return a / b; //divides one integer by another
}

public int modulo(int a, int b){
  return a % b; //finds modulus of integers 
}

  public static void main(String[] args){ // runs calculator for different needs
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45,11));
  }
}
