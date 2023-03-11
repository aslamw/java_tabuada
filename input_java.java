import java.util.Scanner;

public class input_java {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
 
    
        System.out.printf("Informe o número para a tabuada:\n");
        int n = num.nextInt(); // 3.1 entrada de dados (lendo um valor inteiro)

        for (int i = 0; i <= 10; i++){
            System.out.println(n*i);
        }

    }
}
