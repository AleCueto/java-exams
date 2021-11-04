/**
 * Vamos a calcular vueltas de la tierra en x tiempo
 * 
 * 
 * @author Ale Cueto
 */
public class ex06acj4 {
  public static void main(String[] args) {
    System.out.println("!Calculador vueltas de la tierra!");
    int anos = 0;
    int vueltas = 0; 


    // CASO A SIN TENER EN CUENTA BISIESTOS
    anos = 400;
    vueltas = 400 * 365;

    System.out.println("\nApartado a:");

    System.out.print("Sin tener en cuenta los años bisiestos, en 400 años,");
    System.out.print(" la tierra da: " + vueltas + " vueltas\n");



    // CASO B DE LOS AÑOS 1601 a 2000, ambos incluidos
    anos = 400;
    vueltas = (anos - 97) * 365 + (97 * 366);

    System.out.println("\nApartado b:");

    System.out.print("Desde el año 1601 al 2000, La Tierra dio " + vueltas + " vueltas\n");

  }
}