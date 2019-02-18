package observerPatternExample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunj
 */
public class TempObserver implements Observer {
    
    //Variables 
    private int high;
    private int low;
    private int feelsLike; 
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject tempSubject;

    public TempObserver(Subject tempSubject){
        
        this.tempSubject = tempSubject;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        tempSubject.register(this);
    }

    @Override
    public void update(int high, int low, int feelsLike) {
        this.high = high;
        this.low = low;
        this.feelsLike = feelsLike;
        printTemps();
    }

    public void printTemps(){
        System.out.println(observerID + "\nHigh: " + high + "\nLow: " + 
          low + "\nFeels Like: " + feelsLike + "\n");
    }
}