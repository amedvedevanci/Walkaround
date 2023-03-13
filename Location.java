import java.util.Scanner;
public class Location {
    /*
     * Superclass that includes defaults, action functions (lookAround, shinyObject, leave) which are called based on int actionSelection
     * 
     */

   String currentLocation;
   int locationSelection;
   int actionSelection;
   int itemSelection;
   String roomInfo;
   String prompt = "What do you want to do?";
   String actionPrompt = prompt+"\n1. Look around \n2. Pick up the nearest shiny object\n3. Leave";
   static StringBuffer inv = new StringBuffer();
   String inventory;
   boolean isAlive;

   public Location(){
      currentLocation = "You are at the entrance. "+prompt+"\n1. Go to the living room\n2. Go to the kitchen";
      locationSelection = 0;
      actionSelection = 0;
      itemSelection = 0;
      isAlive = true;
   }


     public String getCurrentLocation(){
        return currentLocation;
     }


   public void action(int actionSelection){
      if(actionSelection==1){
         lookAround();
      }

      else if(actionSelection==2){
         shinyObject();
      }

      else if(actionSelection==3){
         leave();
      }

      else{
         System.out.println("Invalid input");
      }
   }

   public void lookAround(){
      System.out.println(roomInfo);
      Scanner inp = new Scanner(System.in);
      itemSelection=inp.nextInt();
   }

   public void shinyObject(){
      itemSelection=(int)((Math.random()*2)+1);
   }

   public void leave(){
      locationSelection=0;
      currentLocation= "You are at the entrance. "+prompt+"\n1. Go to the living room\n2. Go to the kitchen";
   }

     public void die(){
         System.out.println("You died!");
         isAlive=false;
     }

     public boolean aliveCheck(){
         return isAlive;
     }
}
