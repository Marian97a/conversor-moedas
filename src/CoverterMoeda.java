
public class CoverterMoeda {
    private final ConexaoApi conexaoApi = new ConexaoApi();

    public void convertermoeda(String from, String to, double valor) {
        try {
            double rate = conexaoApi.obterTaxa(from, to);
            double resultado = valor * rate;
            System.out.printf("%.2f %s = %.2f %s%n", valor, from, resultado, to);
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}
