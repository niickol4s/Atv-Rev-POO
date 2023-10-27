public class Empregado {
    String nome;
    String sobrenome;
    double salarioMensal;

    public void cadastrar(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual() {
        double salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }

    public double aumentoMensal() {
        double aumentoMensal = salarioMensal + (salarioMensal * 10 / 100);
        return aumentoMensal;
    }

    public double aumentoAnual(double salarioAnual) {
        double aumentoAnual = salarioAnual + (salarioAnual * 10 / 100);
        return aumentoAnual;
    }

    public void informacao() {
        System.out.println("\nInformações do Funcionário:\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Salário Mensal (R$): " + this.salarioMensal);
        System.out.println("Salário Anual (R$): " + salarioAnual());
        System.out.println("Salário Mensal com Aumento de 10% (R$): " + aumentoMensal());
        System.out.println("Salário Anual com Aumento de 10% (R$): " + aumentoAnual(salarioAnual()));
    }
}
