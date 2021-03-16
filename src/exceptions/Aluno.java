package exceptions;

import java.util.Objects;

public class Aluno {

    public final String name;
    public final double nota;

    public Aluno(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && Objects.equals(name, aluno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nota);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", nota=" + nota +
                '}';
    }
}
