import Desafio.dominio.Bootcamp;
import Desafio.dominio.Curso;
import Desafio.dominio.Mentoria;
import Desafio.dominio.Dev;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2");
        curso2.setDescricao("Descrição do Curso Java 2");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Felipe" + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXp());

        System.out.println("-------------");

        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Larissa" + devLarissa.getConteudosInscritos());
        devLarissa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Larissa" + devLarissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Larissa" + devLarissa.getConteudosConcluidos());
        System.out.println("XP:" + devLarissa.calcularTotalXp());

    }
}
