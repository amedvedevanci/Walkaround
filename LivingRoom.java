public class LivingRoom extends Location {
    /*
     * subclass of Location which sets its own defaults and includes itemAction function
     * 
     */

    public LivingRoom(){
        super.locationSelection=1;
        super.currentLocation="You are in the living room. "+actionPrompt;
        super.roomInfo="You approach a table. You see a flashlight and a crystal ball. \n1- Pick up the flashlight\n2- Pick up the crystal ball";
    }

    public void itemAction(){
        if(itemSelection==1){
            System.out.println("You pick up a flashlight. It's daytime, so it doesn't do much, but it might come in handy later.");
            super.inv.append(" flashlight, ");
            leave();
        }
        else if(itemSelection==2){
            System.out.println("You pick up a crystal ball. It explodes! So much for your future, huh?");
            die();
        }
        else if(itemSelection==0){
            leave();
        }
    }    
}
