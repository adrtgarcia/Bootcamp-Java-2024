import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java", "Descrição...", 8);
        Curso cursoJs = new Curso("Curso Js", "Descrição...", 4);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição...", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição...");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev("Maria");
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("--- Histórico de Maria ---");
        System.out.println("Conteúdos Inscritos: " + devMaria.getConteudosInscritos());
        devMaria.progredirBootcamp();
        devMaria.progredirBootcamp();
        System.out.println("\nConteúdos Inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos: " + devMaria.getConteudosConcluidos());
        System.out.println("\nXP: " + devMaria.calcularTotalXp());
        System.out.println();

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        
        System.out.println("--- Histórico de");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredirBootcamp();
        devJoao.progredirBootcamp();
        devJoao.progredirBootcamp();
        System.out.println("\nConteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("\nXP: " + devJoao.calcularTotalXp());
    }
}