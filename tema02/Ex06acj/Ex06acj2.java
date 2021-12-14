/**
 * 20 números en un array y aplicamos filtros
 * 
 * 
 * @author Ale Cueto
 */
public class Ex06acj2 {
  public static void main(String[] args) {
    
    
    int[] numeros = new int[20];
    
    for (int i = 0; i < numeros.length; i++) { // 20 números aleatorios entre 1 y 999
      numeros[i] = (int)(Math.random() * 1000 + 1);
      System.out.print(numeros[i] + "  ");
    }

    System.out.println();
    System.out.println();
    System.out.println("¿Que filtro quieres aplicar?");
    System.out.println("1. Pares");
    System.out.println("2. Primos");
    System.out.println("3. Capicúas");
    System.out.print("Elige una opción: ");
    int opcion = Integer.parseInt(System.console().readLine());

    System.out.println();
    System.out.println("Los números filtrados son:");

    Boolean esPrimo;

    if(opcion == 1){
      for (int i = 0; i < numeros.length; i++) { // Comprueba números pares
        if(numeros[i] % 2 == 0){
        System.out.print(numeros[i] + "  ");
        }
      }
    } else if (opcion==2){
      for (int i = 0; i < numeros.length; i++) { // Comprueba números pares
        if(numeros[i] % 2 == 0){
        }
        esPrimo = true;
        for (int j = 2; j < numeros[i] - 1; j++) {
          if (numeros[i] % j == 0) {
            esPrimo = false;
          }
        }
        if(esPrimo == true){
          System.out.print(numeros[i] + "  ");
        }
      }
    } else if(opcion == 3){
      for (int i = 0; i < numeros.length; i++) {
        int copia = numeros[i];
        int volteado = 0;
        while (copia > 0) {
          volteado = (volteado * 10) + (copia % 10);
          copia /= 10;
        } // while
        if (volteado == numeros[i]) {
          System.out.print(numeros[i] + "  ");
        }
      }

    }

    System.out.println();

  }
}
