import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscrreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Eduardo" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("******");
        System.out.println("Conteudos Inscritos Eduardo" + devEduardo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Eduardo" + devEduardo.getConteudosConcluidos());
        System.out.println("xp: " + devEduardo.calcularXp());
        System.out.println("");
        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        devLeandro.inscrreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Leandro" + devLeandro.getConteudosInscritos());
        devLeandro.progredir();
        devLeandro.progredir();

        System.out.println("******");
        System.out.println("Conteudos Inscritos Leandro" + devLeandro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Leandro" + devLeandro.getConteudosConcluidos());
        System.out.println("xp: " + devLeandro.calcularXp());


    }
}
