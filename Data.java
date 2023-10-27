public class Data {
    int dia;
    int mes;
    int ano;

    public void cadastarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void informacaoData() {
        System.out.println("\nInformações da Data:\n");
        System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);
        System.out.println("Data por Extenso: " + this.dia + " de Outubro de " + this.ano);
    }
}
