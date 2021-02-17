import java.util.Date;


public class OlaMundo {
    public static void main(String args[]){
       System.out.println("Olá Mundo");
       System.out.println("Hoje é "+ new Date()+ "\n\n\n"); 
       AutoMovel xyz = new AutoMovel();
       xyz.ano = 2020;
       xyz.modelo = "Onix";
       xyz.cor = "vermelho";
       xyz.andar();
    }
}
