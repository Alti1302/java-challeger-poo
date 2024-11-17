import br.altieres.challenger.domain.Curso;
import br.altieres.challenger.domain.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Programação Orientada a Objetos");
        curso.setDescricao("Curso voltado para desenvolvimento de software orientado a objetos.");
        curso.setCargaHoraria(40);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Programação Orientada a Objetos");
        mentoria.setDescricao("Mentoria focada em aprender e aplicar os conceitos de POO.");
        mentoria.setData(LocalDate.of(2022, 12, 31));

        System.out.println(mentoria);
    }
}
