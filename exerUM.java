import java.util.Scanner;

/* */

public class exerUM{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        String palavraComMaisVogais = " ";
        int maximoDeVogais = 0;

        char[] vogais = {'a','e','i','o','u'};

        for(String palavra : palavras){
            int contVogais = 0;

            for(int i = 0; i < palavra.length(); i++){
                char letra = Character.toLowerCase(palavra.charAt(i));
                

                int j = 0;
                boolean encontrouVogal = false;
                while(j < vogais.length && !encontrouVogal){
                    if(letra == vogais[j]){
                        contVogais++;
                        encontrouVogal = true;
                    }
                    j++;
                }
            }

            if(contVogais > maximoDeVogais) {
                maximoDeVogais = contVogais;
                palavraComMaisVogais = palavra;
            }
        }

        System.out.println("Palavra com mais vogais: " + palavraComMaisVogais);
        System.out.println("Quantidade: " + maximoDeVogais);

        scanner.close();
    }
}