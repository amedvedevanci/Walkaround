import java.util.Scanner;
public class WalkAroundApp {
    /*
     * Walk around app to navigate between Location superclass and Living Room/Kitchen subclasses
     * 
     */
   public static void main(String args[]){
      
      //vars
      int locationSelection;
      int actionSelection;
      boolean isAlive=true;

      //objects
      Location l= new Location();
      LivingRoom liv = new LivingRoom();
      Kitchen k = new Kitchen();

      Scanner inp =new Scanner(System.in);

      //loop runs until the user dies or wins, determined through the aliveCheck method
      while(isAlive==true){
         
         System.out.println(l.getCurrentLocation());
         locationSelection=inp.nextInt();

         if(locationSelection==1){
            System.out.println(liv.getCurrentLocation());
            actionSelection=inp.nextInt();
            liv.action(actionSelection);
            liv.itemAction();
            isAlive=liv.aliveCheck();
         }

         else if(locationSelection==2){
            System.out.println(k.getCurrentLocation());
            actionSelection=inp.nextInt();
            k.action(actionSelection);
            k.itemAction();
            isAlive=k.aliveCheck();
         }
      }
   }
}
