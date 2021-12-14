/**
 * pinta un rectángulo de triángulos rectángulos
 * 
 * 
 * @author Ale Cueto
 */
public class Ex06acj4 {
  public static void main(String[] args) {
    
    System.out.println();

    System.out.println("Menú del día:");
    System.out.println("---------------");
    
    int ensalada = (int)(Math.random()*3);

    switch(ensalada){
      case 0:
        System.out.println("tomate y mozzarella");
      break;

      case 1:
        System.out.println("rúcula y queso de cabra");
      break;

      case 2:
        System.out.println("endivias con nueces y miel");
      break;
    }

    int platoPrincipal = (int)(Math.random()*3);

    switch(platoPrincipal){
      case 0:
        System.out.println("arroz al curry");
      break;

      case 1:
        System.out.println("quinoa con verduras");
      break;

      case 2:
        System.out.println("espagetis al pesto");
      break;
    }
    
    int postre = (int)(Math.random()*3);
    if(platoPrincipal == 0){
      while(postre == 0){
        postre = (int)(Math.random()*3);
      }
    } 

    switch(postre){
      case 0:
        System.out.println("arroz con leche");
      break;

      case 1:
        System.out.println("natillas");
      break;

      case 2:
        System.out.println("tarta de chocolate");
      break;
    }

  }
}
