import br.altieres.challenger.domain.Bootcamp;
import br.altieres.challenger.domain.Curso;
import br.altieres.challenger.domain.Dev;
import br.altieres.challenger.domain.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Programação Orientada a Objetos");
        curso.setDescricao("Curso voltado para desenvolvimento de software orientado a objetos.");
        curso.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Programação Orientada a Objetos");
        mentoria.setDescricao("Mentoria focada em aprender e aplicar os conceitos de POO.");
        mentoria.setData(LocalDate.of(2022, 12, 31));

//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp voltado para iniciantes em Java.");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("John Doe");
        dev.inscreverBotcamp(bootcamp);
        System.out.println("Conteudos inscritos de John:" + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos inscritos de John:" + dev.getConteudosInscritos());
        System.out.println("Conteudos concluídos de John:" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());
    }
}
