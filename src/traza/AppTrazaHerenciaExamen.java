package traza;

public class AppTrazaHerenciaExamen {
    
    
    
    
   public static void main(String[] args) {
      ClaseA r1 = new ClaseB();
      r1.sm();
      r1.m();
      r1.nm();
      System.out.println();
      ClaseA r2 = new ClaseA();
      r2.sm();
      r2.m();
      r2.nm();
      System.out.println();
      ClaseB r3 = new ClaseB();
      r3.sm();
      r3.m();
      r3.nm();
      System.out.println();
   }
}
