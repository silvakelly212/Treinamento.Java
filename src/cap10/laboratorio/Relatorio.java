package cap10.laboratorio;

    // Implementando a classe Relatorio que implementa a interface Imprimivel
    public class Relatorio implements Imprimivel {
        private String relatorio;

            public Relatorio(String relatorio) {
                this.relatorio = relatorio;
            }

            @Override
            public void imprimir() {
                System.out.println("Relatório sendo impresso");
            }

    }
