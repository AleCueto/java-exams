/**
 * Vamos a ver los latidos de una persona en varios años
 * 
 * 
 * @author Ale Cueto
 */
public class ex06acj2 {
  public static void main(String[] args) {
    System.out.println("!Buenas, vamos a ver los latidos de una persona en un tiempo!");

    System.out.print("Introduzca el tiempo en años: ");
    int anos = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca su ritmo cardíaco medio en pulsaciones por minuto: ");
    int latidosPorMinuto = Integer.parseInt(System.console().readLine());

    long minutos = anos * 365 * 24 * 60;

    long totalLatidos = minutos * latidosPorMinuto;

    System.out.println("En este tiempo, su corazón habrá latido: " + totalLatidos + " veces");
    
  }
}