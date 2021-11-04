/**
 * Vamos a calcular el precio de unos polos
 * 
 * 
 * @author Ale Cueto
 */
public class ex06acj3 {
  public static void main(String[] args) {
    System.out.println("!Buenas, bienvenido a mi tienda de polos!");

    System.out.print("Introduzca la cantidad de polos que desea: ");
    int polos = Integer.parseInt(System.console().readLine());

    System.out.print("1) blanco | 2) color : ");
    int color = Integer.parseInt(System.console().readLine());

    System.out.print("1) serigrafía | 2) bordado : ");
    int accesorio = Integer.parseInt(System.console().readLine());

    double precioTotalPolos = 0;
    double precioPorPolo = 0;
    double precioAccesorio = 0;


    if(polos >= 20){

      System.out.println("EL POLITO BONITO - PRESUPUESTO");


      if(polos <= 39){
        precioPorPolo = 4.9;
      } else if(polos <= 99){
        precioPorPolo = 3.9;
      } else {
        precioPorPolo = 3.2;
      } 
    
      if(color == 2){
        precioPorPolo += precioPorPolo * 0.2;
        precioTotalPolos = polos * precioPorPolo;  
        System.out.printf("\nPolo en color (unid.): %8d", polos);      
      } else{
        System.out.printf("\nPolo en blanco (unid.): %8d", polos);      
      }
    
      System.out.printf("\nPrecio unitario: %16.2f€", precioPorPolo);
      precioTotalPolos = polos * precioPorPolo;        
      System.out.printf("\nTotal textil: %21.2f€", precioTotalPolos);

      switch(accesorio){
        case 1:
          if(polos < 50){
            precioAccesorio = 2;
          } else{
            precioAccesorio = 1.5;
          }
          System.out.printf("\nSerigrafía (c.u.): %14.2f€", precioAccesorio);
          System.out.printf("\nTotal serigrafía (c.u.): %9.2f€", polos * precioAccesorio);
          break;
          
        case 2:
          if(polos < 50){
            precioAccesorio = 3;
          } else{
            precioAccesorio = 2.5;
          }
          System.out.printf("\nBordado (c.u.): %17.2f€", precioAccesorio);
          System.out.printf("\nTotal bordado (c.u.): %12.2f€", polos * precioAccesorio);
          break;
        }

        
        precioTotalPolos += polos * precioAccesorio;

        System.out.printf("\nPolo más logotipo: %16.2f€", precioTotalPolos);
        System.out.printf("\nIVA: %29.2f€", precioTotalPolos * 0.21);

        precioTotalPolos =  precioTotalPolos * 1.21;

      System.out.printf("\nTOTAL: %28.2f€\n", precioTotalPolos);

    } else{
      System.out.println("Lo sentimos, pero el pedido mínimo son 20 polos");
    }
    
  }
}