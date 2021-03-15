package streams;

public class Aluno {

    final String name;
    final double nota;

    public Aluno(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", nota=" + nota +
                '}';
    }
}
