/**
 * Vamos a traducir números a palabras
 * 
 * 
 * @author Ale Cueto
 */
public class ex06acj1 {
  public static void main(String[] args) {
    System.out.println("!Buenas, vamos a traducir números a palabras!");
    System.out.print("Introduce un PIN de 4 dígitos: ");
    double numero = Double.parseDouble(System.console().readLine());

    int unidad = (int)numero % 10;
    int decena = (int)numero / 10 % 10;
    int centena = (int)numero / 100 % 10;
    int millar = (int)numero / 1000 % 10;

    String unidadNombre = "";
    String decenaNombre = "";
    String centenaNombre = "";
    String millarNombre = "";

    if(numero < 10000 && numero >= 0){

      
      switch(unidad){
        case 1:
        unidadNombre = "uno";
      break;
      
      case 2:
      unidadNombre = "dos";
      break;

      case 3:
        unidadNombre = "tres";
        break;
        
      case 4:
      unidadNombre = "cuatro";
      break;
      
      case 5:
      unidadNombre = "cinco";
      break;
      
      case 6:
      unidadNombre = "seis";
      break;

      case 7:
        unidadNombre = "siete";
      break;

      case 8:
        unidadNombre = "ocho";
        break;

        case 9:
        unidadNombre = "nueve";
        break;

        default:
        unidadNombre = "cero";
        
    }
    

    switch(decena){
      case 1:
      decenaNombre = "uno";
      break;
      
      case 2:
        decenaNombre = "dos";
      break;
      
      case 3:
        decenaNombre = "tres";
        break;
        
      case 4:
        decenaNombre = "cuatro";
        break;
        
      case 5:
      decenaNombre = "cinco";
      break;

      case 6:
        decenaNombre = "seis";
        break;
        
      case 7:
        decenaNombre = "siete";
      break;
      
      case 8:
      decenaNombre = "ocho";
      break;

      case 9:
      decenaNombre = "nueve";
      break;
      
      default:
      decenaNombre = "cero";

    }

    switch(centena){
      case 1:
      centenaNombre = "uno";
      break;
      
      case 2:
      centenaNombre = "dos";
      break;
      
      case 3:
        centenaNombre = "tres";
        break;
        
        case 4:
        centenaNombre = "cuatro";
        break;

        case 5:
        centenaNombre = "cinco";
        break;

      case 6:
      centenaNombre = "seis";
      break;

      case 7:
      centenaNombre = "siete";
      break;
      
      case 8:
      centenaNombre = "ocho";
      break;

      case 9:
      centenaNombre = "nueve";
      break;
      
      default:
        centenaNombre = "cero";
        
    }
    
    
    switch(millar){
      case 1:
      millarNombre = "uno";
      break;
      
      case 2:
        millarNombre = "dos";
        break;
        
      case 3:
      millarNombre = "tres";
      break;
      
      case 4:
        millarNombre = "cuatro";
        break;

        case 5:
        millarNombre = "cinco";
      break;
      
      case 6:
      millarNombre = "seis";
      break;
      
      case 7:
      millarNombre = "siete";
      break;
      
      case 8:
      millarNombre = "ocho";
      break;
      
      case 9:
      millarNombre = "nueve";
      break;
      
      default:
      millarNombre = "cero";
      
    }
  } else{
    System.out.println("Error al introducir el PIN, debe ser de cuatro dígitos y positivo");
  }
    
    
    System.out.println(millarNombre + " " + centenaNombre + " " + decenaNombre + " " + unidadNombre);
    
  }
}