/**
 * pinta un rectángulo de triángulos rectángulos
 * 
 * 
 * @author Ale Cueto
 */
public class Ex06acj3 {
  public static void main(String[] args) {
    

    System.out.print("Indique el ancho en triángulos: ");
    int anchoOrignal = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el alto en triángulos: ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.println();

    for (int i = 0; i < alto; i++) { 
      
      int espacios = 4;
      int caracteres = 1;
      int ancho = anchoOrignal;
      
      pintarFilaRectangulos(ancho, espacios, caracteres);
      
          System.out.println();
      
    }

  }

  public static void pintarEspacios(int numeroEspacios){
    for (int i = 0; i < numeroEspacios; i++) {
      System.out.print(" ");
    }
  }

  public static void pintarCaracteres(int numeroCaracteres, String caracter){
    for (int i = 0; i < numeroCaracteres; i++) {
      System.out.print(caracter);
    }
  }

  public static void pintarFilaRectangulos(int ancho, int espacios, int caracteres){
    for (int i = 0; i < 4; i++) { //Pintar fila triángulos

      for (int j = 0; j < ancho; j++) {
        pintarEspacios(espacios);
        pintarCaracteres(caracteres, "*");
      }
      System.out.println();

      espacios--;
      caracteres++;
    }
  }

}
