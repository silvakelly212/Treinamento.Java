package cap15.laboratorio;

public class Estudante {

  String nome;
  double notaMatematica;
  double notaPotugues;
  double media;

    public String getNome() {
        return nome;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public double getNotaPotugues() {
        return notaPotugues;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public void setNotaPotugues(double notaPotugues) {
        this.notaPotugues = notaPotugues;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "estudante{" +
                "nome='" + nome + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaPotugues=" + notaPotugues +
                ", media=" + media +
                '}';
    }
}
