public class FaturaTeste {
    public static void main(String [] args) {
        Fatura fatura = new Fatura();

        fatura.cadastrar("012", "Celular", 2, 3500);
        fatura.informacao();
    }
}
