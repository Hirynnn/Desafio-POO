import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Cursinho delicia");
        curso1.setDescricao("Aprendendo poo");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de cria");
        mentoria1.setDescricao("Me pegando pela mão");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);



        
    }
}