package homeWork6.task3;

public class Methods {

    //3) Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б
    //розраховували додавання, віднімання, множення, ділення двох змінних. При цьому врахувати :
    //Якщо a<0 і b<0 викидаємо IllegalArgumentException
    //Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
    //Якщо a=0 і b=0 викидаємо IllegalAccessException
    //Якщо a>0 і b>0 викидаємо MyException
    //Протестувати всі можливі варіанти, і вивести все на консоль.

    public void plus(int number1, int number2) {
        System.out.println("Sum = " + (number1 + number2));
    }

    public void minus(int number1, int number2) {
        System.out.println("Subtraction = " + (number1 - number2));
    }

    public void multiply(int number1, int number2) {
        System.out.println("Multiplication = " + (number1 * number2));
    }
    public void divide(int number1, int number2) {

        if(number2 == 0) {
            System.out.println("Division by zero is impossible");
        }
        else {
            System.out.println("Division = " + (double) number1 / number2);
        }
    }
}
