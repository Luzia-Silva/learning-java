public class StructureCondicional {

   public static  void main(String[] args){
       int  avaliationResult = 70;
       String nota = "";

       if(avaliationResult >= 70){
           nota = "A";
       }
       else {
           nota = "F";
       }

       switch (nota){
           case "A":
               System.out.println("Aprovado");
               break;
           case "F":
               System.out.println("Reprovado");
               break;
           default:
               System.out.println("Resultado inválido!");
       }
   }
}
