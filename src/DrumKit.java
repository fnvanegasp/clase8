/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
class DrumKit {
    boolean topHat = true;
    boolean snare = true;
    
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
    
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
    
}

class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        if (d.snare == true){
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }
}
