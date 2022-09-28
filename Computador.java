
//Declaração e implementação da classe Computador (atende ao quesito 01 da atividade)
public class Computador {

    //Atributos
    private String processador;
    private double memoriaRAM;
    private double armazenamentoHD;

    //Método construtor recebendo atributos
    public Computador(String processador, double memoriaRAM, double armazenamentoHD) {

        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamentoHD = armazenamentoHD;
    }

    //Método construtor vazio (pode iniciar objeto sem parâmetros iniciais)
    public Computador() {

    }

    //Implementação do método calcular (atende ao quesito 02 da atividade)
    public double calcular(double n1, double n2, char operacao) {

        double op = 0;

        //Solução com bloco switch
        switch (operacao) {
            case '+':
                op = n1 + n2;
                break;
            case '-':
                op = n1 - n2;
                break;
            case '*':
                op = n1 * n2;
                break;
            case '/':
                op = n1 / n2;
                break;
        }

        return op;

        //Solução com if-else encadeados
        /*if (operacao == '+')
            return n1 + n2;
        else if (operacao == '-')
            return n1 - n2;
        else if (operacao == '*')
            return n1 * n2;
        else /* / (divisão) 
            return n1 / n2;*/
    }

    //Implementação do método que vai imprimir valores ímpares a partir do 1 até um valor n informado via parâmetro (atende ao quesito 02 da atividade)
    public void imprimeImparesNVezes(int n) {

        for (int i = 1; i <= n; i+=2) {
            System.out.println(i);
        }
    }

    //A partir daqui, métodos setters e getters...
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(double memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getArmazenamentoHD() {
        return armazenamentoHD;
    }

    public void setArmazenamentoHD(double armazenamentoHD) {
        this.armazenamentoHD = armazenamentoHD;
    }    
}
