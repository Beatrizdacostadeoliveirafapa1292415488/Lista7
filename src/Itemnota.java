public class Itemnota {
    private String produto;
    private double precoUnitario;
    private int quantidade;
    private double aliquota;


    public Itemnota(String produto, double precoUnitario, int quantidade, double aliquotaICMS) {
        this.produto =produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.aliquota= aliquota;
    }


    public double calcularTotalItem() {
        return precoUnitario * quantidade;
    }


    public double calcularValorICMS() {
        return (calcularTotalItem() * aliquota) / 100;
    }


    public void mostrarItem(int numeroItem) {
        System.out.println("Item " + numeroItem + ":");
        System.out.println("Descrição: " +produto);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total do Item: R$ " + calcularTotalItem());
        System.out.println("Alíquota ICMS: " + aliquota + "%");
        System.out.println("Valor ICMS: R$ " + calcularValorICMS());
        System.out.println();
    }
}
