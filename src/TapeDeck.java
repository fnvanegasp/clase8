/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class TapeDeck {
    public boolean canRecord = false;
    
    void playTape(){
        System.out.println("tape playing");
    }
    
    void RecordTape(){
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive{
    public static void main(String[] args){
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();
        
        if(t.canRecord == true){
            t.RecordTape();
        }
    }
}
