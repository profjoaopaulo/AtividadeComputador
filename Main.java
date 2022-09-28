import java.util.Scanner;

//Declaração e implementação da classe teste (atende o quesito 03 da atividade)
public class Main {
    
    public static void main(String[] args) {
        
        //Declaração e instanciação do objeto da classe Computador - note que usa-se a versão do construtor com argumentos
        Computador pc = new Computador("Intel Core i7", 8.0, 1000);
        
        //Apenas imprimindo os dados do pc instanciado
        System.out.println("O PC cadastrado de processador " 
        + pc.getProcessador() + ", de memória RAM " 
        + pc.getMemoriaRAM() + " GB e de armazenamento de " 
        + pc.getArmazenamentoHD() + " GB.");

        //Apresentar menu repetitivo com as opções de cálculo ou impressão dos ímpares
        while (true) {
            
            System.out.println("Digite um inteiro para as opções:\n"
            + "1 - Cálculo;\n2 - Imprimir ímpares;\nOutro para encerrar.\nQual a sua opção?");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            //tratando neste if a opção de fazer o cálculo
            if(opcao == 1) {

                System.out.println("Qual cálculo a ser feito?\n"
                + "1 - somar;\n2 - subtrair;\n3 - produto;\n4 - divisão.");
                opcao = sc.nextInt();
                System.out.println("Quais os valores a computar?");
                double a = sc.nextDouble();
                double b = sc.nextDouble();

                switch (opcao) {
                    case 1://soma
                        System.out.println("Soma de " + a + " com " + b + " = " + pc.calcular(a, b, '+'));
                        break;
                    case 2://subtração
                        System.out.println("Diferença de " + a + " com " + b + " = " + pc.calcular(a, b, '-'));
                        break;
                    case 3://produto
                        System.out.println("Produto de " + a + " com " + b + " = " + pc.calcular(a, b, '*'));
                        break;
                    case 4://divisão
                        System.out.println("Divisão de " + a + " com " + b + " = " + pc.calcular(a, b, '/'));
                        break;                
                    default:
                        break;
                }
            }
            else if(opcao == 2) { //Imprimir os ímpares
            
                System.out.println("Até qual valor imprimir os ímpares?");
                int n = sc.nextInt();
                pc.imprimeImparesNVezes(n);
            }
            else
                break;

            //sc.close();
        }
    }
}
