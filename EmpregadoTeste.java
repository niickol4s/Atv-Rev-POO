public class EmpregadoTeste {
    public static void main(String [] args) {
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();

        empregado1.cadastrar("Leandro", "Feitosa", 5200);
        empregado1.informacao();

        empregado2.cadastrar("Camila", "Mendes", 6100);
        empregado2.informacao();
    }
}
