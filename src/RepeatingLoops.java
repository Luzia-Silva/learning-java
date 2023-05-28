public class RepeatingLoops {
    public static void main(String[] args){
        // Criação de uma Tabuada
        for(int i=1; i <=10; i++){
            for(int j=1; j <=10; j++){
                System.out.printf("%s X %s = %s %n", i, j, i*j);
            }
            System.out.printf("%n");
        }
    }
}
