package cap10.laboratorio;

    public class Grafico implements Imprimivel {
        private String grafico;

        public Grafico(String grafico) {
            this.grafico = grafico;
        }

        @Override
        public void imprimir() {
            System.out.println("Grafico sendo impresso");
        }

    }
