import java.util.Random;
public class arreglo{
    public static void main(String[] args ){
      try{
        int [][] lista = new int [5][5];
        Random random = new Random();
        for (int x=0; x < lista.length; x++){
          for (int y=0; y < lista.length; y++){
                lista[x][y] = random.nextInt(90);
          }
        }
        System.out.println("hola "+lista[2][1]);
        //System.out.println("hola ");
      }catch (Exception e){
        System.out.println(e.getMessage());
      }
    }
}