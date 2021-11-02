package model.car;

public class Engine {

   private String type;
   private boolean started;

   public Engine(String type) {
      this.type = type;
   }

   public Engine(boolean started) {
      this.started = started;
   }

   public boolean startEngine() {
      System.out.println("Двигатель запущен  :)");
      return true;
   }

   public void stopEngine() {
      System.out.println("Двигатель заглушен  :(");
   }

   @Override
   public String toString() {
      return "Engine{" +
              "type='" + type + '\'' +
              ", started=" + started +
              '}';
   }
}