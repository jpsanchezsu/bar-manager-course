//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ron = 30; //ml
        double ronPrecioMl = 80; //Cada ml de ron
        int azucar = 60; //gr
        double azucarPrecio = 3.20; //Precio en pesos
        int limon = 1; //Por unidades
        double limonPrecio = 800; //precio en pesos colombianos
        int hierbabuena = 12; //Hojas de hierbabuena
        double hierPrecio = 60; //Precio x Hoja
        int soda = 150; //ml
        double sodaPrecio = 8.30; // Precio x ml
        double costoRon = ron*ronPrecioMl;
        double costoAzucar = azucar*azucarPrecio;
        double costoLimon = limon*limonPrecio;
        double costoHierbabuena = hierbabuena*hierPrecio;
        double costoSoda = soda*sodaPrecio;
        double costoTotal = costoAzucar+costoHierbabuena+costoSoda+costoLimon+costoRon;
        final double umbralCostoElevado = 6000; // final es constante (no se puede modificar)
        System.out.printf("Costo ron: %.2f%n",costoRon);
        System.out.printf("Costo azucar: %.2f%n",costoAzucar);
        System.out.printf("Costo limon: %.2f%n",costoLimon);
        System.out.printf("Costo hierbabuena: %.2f%n",costoHierbabuena);
        System.out.printf("Costo soda: %.2f%n",costoSoda);

        // Costo final de la receta
        System.out.printf("el costo del coctel es %.2f%n", costoTotal);

        if (costoTotal > umbralCostoElevado){
            System.out.println("Costo elevado, revisar receta");
        }
    }
}