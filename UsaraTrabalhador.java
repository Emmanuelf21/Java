
import java.util.Scanner;

public class UsaraTrabalhador {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Trabalhador x = new Trabalhador();
        
        System.out.println("Digite o seu nome: ");
        x.setNome(sc.next());
        
        System.out.println("Digite o salário: ");
        x.setSalario(sc.nextFloat());
        
        System.out.println("Eu tenho no trabalhador x "+ x.getNome()+ " "+ x.getSalario());
        
        Trabalhador y = new Trabalhador("Emmanuel Franco", 15000.0f);
        System.out.println("Eu tenho no trabalhador y "+ y.getNome()+ " "+ y.getSalario());
        
        System.out.println(x.toString());
        System.out.println(y.toString());
    }
}
