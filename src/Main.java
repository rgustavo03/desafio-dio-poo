import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {

        // Criacao de cursos
        Conteudo cursoJs = new Curso("Curso de Javascript", "Curso do básico ao avançado", 30);
        Conteudo cursoPy = new Curso("Curso Python", "Python para análise de dados", 50);
        Conteudo cursoReact = new Curso("Curso React", "React Native", 40);
        Conteudo mentoriaPj = new Mentoria("Mentoria de projetos", "Descrição da Mentoria");

        // Criacao do bootcamp
        Bootcamp bootcampDev = new Bootcamp();
        // Inserindo os cursos no bootcamp
        bootcampDev.getConteudos().add(cursoJs);
        bootcampDev.getConteudos().add(cursoPy);
        bootcampDev.getConteudos().add(cursoReact);
        bootcampDev.getConteudos().add(mentoriaPj);

        // Criando Dev
        Dev devGus = new Dev();
        devGus.setNome("Gus");
        // Inscrevendo Dev no bootcamp
        devGus.inscreverBootcamp(bootcampDev);
        // Ver em quais conteudos esta inscrito
        System.out.println(devGus.getConteudosInscritos());
        // Pega primeiro conteudo do Set conteudoInscritos, o remove de la e coloca em Concluidos
        devGus.progredir();
        devGus.progredir();
        devGus.progredir();
        devGus.progredir();
        devGus.progredir(); // Aqui, conteudoInscritos esta vazia. Erro sera printado
        // Ver conteudos concluidos
        System.out.println(devGus.getConteudosConcluidos());
    }
}