import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();

        curso1.setTitulo("Cursinho delicia");
        curso1.setDescricao("Aprendendo poo");
        curso1.setCargaHoraria(32);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de python");
        curso2.setDescricao("Aprendendo o basico de python");
        curso2.setCargaHoraria(32);


        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de cria");
        mentoria1.setDescricao("Me pegando pela mão");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Análise de dados com pythoon");
        bootcamp.setDescricao("Aprendendo a análisar dados e métricas com python");
        bootcamp.getCounteudos().add(curso1);
        bootcamp.getCounteudos().add(curso2);

        Dev vitor = new Dev();
        vitor.setNome("Vito");
        vitor.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos do Vitor:"+vitor.getCounteudosInscritos());

        Dev giulia = new Dev();
        giulia.setNome("giulia");
        giulia.inscreverBootcamp(bootcamp);
        System.out.println("-----");
        System.out.println("Conteudos inscritos da Giulia:"+giulia.getCounteudosInscritos());
        giulia.progredir();
        giulia.progredir();
        System.out.println("Conteudos inscritos da Giulia:"+giulia.getCounteudosInscritos());
        System.out.println("Conteudos concluidos da Giulia:"+giulia.getCounteudosConcluidos());
        System.out.println("Horas concluidas"+giulia.calcularTotalXp());












    }
}