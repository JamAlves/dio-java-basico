public class OperadoresRelacionais {
    public static void main(String[] args) {
         
        String nomeUm = "Jam";
        String nomeDois = new String("Alves");

        System.out.println(nomeUm.equals(nomeDois));

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        System.out.println("numeroUm e igual a numeroDois?" + simNao);

        simNao = num1 != num2;
        System.out.println("numeroUm e diferente a numeroDois" + simNao);

        simNao = num1 > num2;
        System.out.println("numeroUm e maior que numeroDois?" + simNao);
    }
}
