//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] ingredientes = {"Ron", "Azucar", "limon", "Hierbabuena", "Soda"}; //Ingredientes de un mojito
        double[] precios = {80,3.20,800,60,8.30}; //Precio por unidad
        double[] cantidades = {30,60,1,12,150};
        final double umbral = 6000;
        double [] costos = calcularCostos(cantidades,precios);
        imprimirDetalle(ingredientes,costos);
        double total = calcularTotal(costos);

        if (total>umbral){
            System.out.printf("El costo del coctel es muy elevado, revisar receta %n");
        }
        System.out.printf("El costo total del coctel es: %.2f%n", total);
    }

    //SOLUCION PRIMER PUNTO
    static double[] calcularCostos (double[] cantidades, double[] precios){
        double [] resultado = new double [cantidades.length]; //Crea un array de longitud cantidades
        for (int i=0; i<cantidades.length; i++){
            resultado[i] = precios[i]*cantidades[i]; //operaciones calcular costo
        }
        return resultado; //retorna una lista de costo por ingrediente
    }

    //SOLUCION SEGUNDO PUNTO
    static double calcularTotal (double[] costo){
        double resultado = 0;//DECLARACION DEL RESULTADO
        for (int i=0; i<costo.length; i++){
            resultado += costo[i];//FOR PARA SUMAR TODOS LOS DATOS DE LA LISTA
        }
        return resultado;//RETORNA SUMA TOTAL DE LA LISTA
    }

    //SOLUCION PUNTO TRES
    static  void imprimirDetalle(String[] ingredientes, double[] costos){
        for (int i=0; i< ingredientes.length; i++){
            System.out.printf("%s: %.2f%n", ingredientes[i], costos[i]); //IMPRIME INGREDIENTE Y COSTO DE CADA UNO
        }
    }
}