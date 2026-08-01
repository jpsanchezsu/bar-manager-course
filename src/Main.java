//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ingredientes = {"Ron", "Azucar", "limon", "Hierbabuena", "Soda"}; //Ingredientes de un mojito
        double[] precios = {80,3.20,800,60,8.30}; //Precio por unidad
        double[] cantidades = new double[ingredientes.length];
        final double umbral = 6000;
        boolean stockCantidades = true;
        for (int i=0;i<ingredientes.length; i++){
            System.out.printf("Ingresa la cantidad de %s: ", ingredientes[i]);
            cantidades[i] = sc.nextDouble();
            if (cantidades[i] == 0){
                stockCantidades = false;
            }
        }
        double [] costos = calcularCostos(cantidades,precios);
        imprimirDetalle(ingredientes,costos);
        double total = calcularTotal(costos);

        if (total>umbral && !stockCantidades){
            System.out.printf("Revisar la receta, hay ingredientes en cero y el costo es alto %n");
        } else if (total>umbral) {
            System.out.printf("Costo del coctel es elevado %n");
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