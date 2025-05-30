
public class CoverterMoeda {
    private final ExchangeRateService service = new ExchangeRateService();

    public void convertermoeda(String from, String to, double valor) {
        try {
            double rate = service.obterTaxa(from, to);
            double resultado = valor * rate;
            System.out.printf("%.2f %s = %.2F %s%n", valor, from, resultado, to);
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}
