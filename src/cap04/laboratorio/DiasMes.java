package cap04.laboratorio;

public class DiasMes {
    public static void main(String[] args) {
        String mes = "Fevereiro";
        switch (mes) {
            case "Janeiro":   System.out.println(" mes escolhido tem 31 dia");break;
            case "Fevereiro": System.out.println(" mes escolhido tem 28 dia");break;
            case "Marco":     System.out.println(" mes escolhido tem 31 dia");break;
            case "Abril":     System.out.println(" mes escolhido tem 30 dia");break;
            case "Maio":      System.out.println(" mes escolhido tem 31 dia");break;
            case "Junho":     System.out.println(" mes escolhido tem 30 dia");break;
            case "Julho":     System.out.println(" mes escolhido tem 31 dia");break;
            case "Agosto":    System.out.println(" mes escolhido tem 30 dia");break;
            case "Setembro":  System.out.println(" mes escolhido nao tem 31 dia");break;
            case "Outubro":   System.out.println(" mes escolhido tem 30 dia");break;
            case "Novembro":  System.out.println(" mes nao escolhido tem 31 dia");break;

            default:
                System.out.println("nao tem mes informado");
        }
    }
}

