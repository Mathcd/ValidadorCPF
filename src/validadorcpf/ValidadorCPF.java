package validadorcpf;

/**
 * @author Matheus
 */
public class ValidadorCPF {

    //insere o número do CPF (com ou sem verificadores) em um vetor, com cada dígito em uma posição
    //o 1º parâmetro é o CPF, o 2º é a quantidade de dígitos (9-sem verificadores; 11-com verificadores);
    public static int[] preencheVetor(long num, int length) {
        int vet[] = new int[length];
        String n = String.valueOf(num);
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return vet;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
