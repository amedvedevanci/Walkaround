public class Kitchen extends Location {
    /*
     * subclass of the Location class which sets its own defaults, includes an itemAction function
     * and overrides the leave function from the Location class
     */

    public Kitchen(){
        super.locationSelection=2;
        super.currentLocation="You are in the kitchen. "+actionPrompt;
        super.roomInfo="You approach the counter. You see a cutting board and a corkscrew.\n1. Pick up the cutting board\n2.Pick up the corkscrew";
    }

    public void itemAction(){
        if(itemSelection==1){
            System.out.println("You pick up the cutting board. You fail to notice the blade stuck in it. Oops");
            die();
        }
        else if(itemSelection==2){
            System.out.println("You pick up the corkscrew. There is no wine, but you might use it later.");
            super.inv.append(" corkscrew, ");
            leave();
        }
        else if(itemSelection==0){
            leave();
        }
    } 

    @Override
    public void leave() {
        System.out.println("You try to leave. The door is jammed! You smell gas...");
        inventory = super.inv.toString();
        System.out.println(inventory);
        if(super.inventory.contains("flashlight") && super.inventory.contains("corkscrew")){
            System.out.println("The flashlight helps you see the latch. The gap is wide enough to open the door with the corkscrew! You win!");
            super.isAlive=false;
        }
        else if(super.inventory.contains("corkscrew")){
            System.out.println("You try to open the door with the corkscrew. That's not gonna work...");
            die();
        }
        else{
            die();
        }
    }
}
