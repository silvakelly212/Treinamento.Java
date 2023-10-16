package cap11;
import java.util.Random;
public class Exemplo2 {
    public static void main(String[] args) {
            int[] numerosSorteados = sortearMegaSena();

            System.out.print("Números sorteados na Mega-Sena: ");
            for (int numero : numerosSorteados) {
                System.out.print(numero + " ");
            }
        }

        public static int[] sortearMegaSena() {
            int[] numerosSorteados = new int[6];
            Random random = new Random();

            for (int i = 0; i < 6; i++) {
                int numeroSorteado;
                do {
                    numeroSorteado = random.nextInt(60) + 1; // Gera números de 1 a 60
                } while (jaFoiSorteado(numerosSorteados, numeroSorteado));

                numerosSorteados[i] = numeroSorteado;
            }

            return numerosSorteados;
        }

        public static boolean jaFoiSorteado(int[] numerosSorteados, int numero) {
            for (int i = 0; i < numerosSorteados.length; i++) {
                if (numerosSorteados[i] == numero) {
                    return true;
                }
            }
            return false;
        }
    }


