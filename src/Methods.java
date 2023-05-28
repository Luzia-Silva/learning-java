public class Methods {
    public static void main(String[] args){
       int value = Calculo(1, 2);
        System.out.println(value);
        Multiplication(3, 3);
    }
    public static int Calculo(int number1, int number2){
        // Essa  função precisa de um return
        int soma = number1 + number2;
        return  soma;
    }
    public static void Multiplication(int number1, int number2){
        //Metodo void não precisa retornar algo
        int multiplication = number1 * number2;
        System.out.println(multiplication);

    }
}
