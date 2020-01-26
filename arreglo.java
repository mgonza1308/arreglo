import java.util.Random;
public class arreglo{
    public static void main(String[] args ){
        int [][] lista = new int [5][5];
        Random random = new Random();
      try{
        for (int x=0; x < lista.length; x++){
          for (int y=0; y < lista.length; y++){
                lista[x][y] = random.nextInt(4);
          }
        }
        System.out.println("hola "+lista[2][1]);
        //System.out.println("hola ");
      }catch (Exception e){
        System.out.println(e.getMessage());
      }
      //la ccolumna 3 es la que tiene el valor cero
      for (int m=0; m < lista.length; m++) {
          if (lista[m][3] == 0) {
            System.out.println("Valor con cero "+lista[m][3]);
          }else{
              System.out.println("Valor sin cero "+lista[m][3]);
          }
      }
    }
}