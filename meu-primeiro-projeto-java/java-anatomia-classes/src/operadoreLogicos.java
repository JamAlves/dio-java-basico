public class operadoreLogicos {
    public static void main(String[] args) {
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condiçoes sao verdadeira");
        }
        if(condicao1 || condicao2){
            System.out.println("Umas da condicoes e verdadeira");
        }else{
            System.out.println("fim");
        }
    }
}
