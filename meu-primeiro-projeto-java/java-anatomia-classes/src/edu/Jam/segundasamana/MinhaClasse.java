package edu.Jam.segundasamana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primenoNome = "Jam";
        String segundoNome = "Alves";
        
        String nomeCompleto = nomeCompleto(primenoNome, segundoNome);
        System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
