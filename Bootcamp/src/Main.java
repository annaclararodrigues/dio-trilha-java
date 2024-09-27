import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bootcamp bootcampDIO = new Bootcamp("BootCampo DIO Claro", "Bootcamp Java e Spring em parceria com a Claro.");

        Curso cursoJava = new Curso("Java Básico", "Aprendendo o básico do Java", 5);
        Curso cursoPoo = new Curso("POO", "Programação Orientada a Objetos", 8);
        Mentoria mentoriaPoo = new Mentoria("Mentoria POO", "Revisando o básico da POO", LocalDate.now());

        bootcampDIO.addConteudo(cursoJava);
        bootcampDIO.addConteudo(cursoPoo);
        bootcampDIO.addConteudo(mentoriaPoo);

        Dev devAnna = new Dev("Anna Clara");
        Dev devPedro = new Dev("Pedro");


        devAnna.inscreverBootcamp(bootcampDIO);
        devPedro.inscreverBootcamp(bootcampDIO);

        System.out.println("INSCRIÇÃO DOS DEVS EM BOOTCAMPS: ");
        System.out.println("Conteúdos Inscritos Dev Anna Clara: \n" + devAnna.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Dev Pedro: \n" + devPedro.getConteudosInscritos());


        devAnna.progredir2(cursoJava);
        devPedro.progredir2(cursoPoo);
        devPedro.progredir2(mentoriaPoo);

        System.out.println("\nDESENVOLVIMENTO DOS DEVS: ");
        System.out.println("Conteúdos Concluídos Dev Anna Clara: \n" + devAnna.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos Dev Pedro: \n"+ devPedro.getConteudosConcluidos());


        System.out.println("\nXP DOS DEVS:");
        System.out.println("XP Dev Anna Clara: "+ devAnna.calcularXPTotal());
        System.out.println("XP Dev Pedro: "+ devPedro.calcularXPTotal());



    }
}