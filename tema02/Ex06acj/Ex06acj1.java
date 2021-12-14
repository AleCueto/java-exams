/**
 * Pinta un barco con un comerciante y sus productos
 * 
 * 
 * @author Ale Cueto
 */
public class Ex06acj1 {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a pintar un barco con un comerciante y sus productos:!");
    System.out.print("Introduzca la eslora del barco (mayor o igual a 3): ");
    int eslora = Integer.parseInt(System.console().readLine());


    int productos = (int)(Math.random()*2);

    int posicion = 0;

    
    if(productos == 0){

      int posicionZorro = (int)(Math.random() * eslora);
      int posicionComerciante = (int)(Math.random() * eslora);
      int posicionMaiz = (int)(Math.random() * eslora);

      while(posicionComerciante == posicionZorro){
        posicionComerciante = (int)(Math.random() * eslora);
      }

      while(posicionMaiz == posicionZorro || posicionMaiz == posicionComerciante){
        posicionMaiz = (int)(Math.random() * eslora);
      }

      for (int i = 0; i < eslora; i++) {
        if(posicion == posicionComerciante){
          System.out.print("C");
        } else if(posicion == posicionMaiz){
          System.out.print("M");
        }else if(posicion == posicionZorro){
          System.out.print("Z");
        } else{
          System.out.print(" ");
        }
        posicion++;
      }



    } else if (productos == 1){
      int posicionGallina = (int)(Math.random() * eslora);
      int posicionComerciante = (int)(Math.random() * eslora);

      while(posicionComerciante == posicionGallina){
        posicionComerciante = (int)(Math.random() * eslora);
      }

      for (int i = 0; i < eslora; i++) {
        if(posicion == posicionComerciante){
          System.out.print("C");
        } else if(posicion == posicionGallina){
          System.out.print("G");
        } else{
          System.out.print(" ");
        }
        posicion++;
      }

    }

    System.out.println();

    
    for (int i = 0; i < eslora; i++) {
      System.out.print("*");
    }

    System.out.println();
    System.out.print(" ");

    for (int i = 0; i < eslora-2; i++) {
      System.out.print("*");
    }

    System.out.println();

  }
}
