public class Nota {
    private Itemnota item1;
    private Itemnota item2;
    private Itemnota item3;


    public Nota(Itemnota item1, Itemnota item2, Itemnota item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }


    public double calculaTotal() {
        return item1.calcularTotalItem() + item2.calcularTotalItem() + item3.calcularTotalItem();
    }


    public static void mostrarnota() {
        System.out.println("===== Nota Fiscal =====");
        item1.mostrarItem(1);
        item2.mostrarItem(2);
        item3.mostrarItem(3);
        System.out.println("Total da Nota Fiscal: R$ " + calculaTotal());
    }

}
