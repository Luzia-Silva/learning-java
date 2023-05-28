import java.util.Arrays;

public class ArraysExemples {
    public static void main(String[] args){
        // Exemplo com numeros
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Exemplo com Array de String
        String[] names = new String[2];
        names[0] = "Luzia";
        names[1] = "Alan";
        // Exibindo o array sem precisar de looping
        System.out.println(Arrays.toString(names));

        // Exemplo criando os arrays com valores já definidos e calculando média, maior e menor.
        int[] exempleNumbers ={ 9, 10, 4, 23 };
        int maior = exempleNumbers[0]; // Inicia com primeiro valor do array e depois inicia as validações
        int menor = exempleNumbers[0];
        int media = 0;

        for (int i=0; i<exempleNumbers.length; i++){
            if(exempleNumbers[i] >= maior){
                maior = exempleNumbers[i];
            }
            if(exempleNumbers[i] < menor){
                menor = exempleNumbers[i];
            }
            media += exempleNumbers[i] / exempleNumbers.length;
        }

        System.out.println("Média " + media);
        System.out.println("Menor " + menor);
        System.out.println("Maior " + maior);
    }
}
