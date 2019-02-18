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
import java.util.ArrayList;

public class TempSubject implements Subject{
    //Variables
    private ArrayList<Observer> observers;
    private int high;
    private int low;
    private int feelsLike;

    public TempSubject(){
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        
        observers.add(newObserver);
    }

    public void remove(Observer deleteObserver) {    
        observers.remove(deleteObserver);
    }

    public void notifyObserver() {
        for(Observer observer : observers){   
            observer.update(high, low, feelsLike);   
        }
    }

    public void setHigh(int newHigh){
        this.high = newHigh;
        notifyObserver();
    }

    public void setLow(int newLow){
        this.low = newLow;
        notifyObserver();
    }

    public void setFeelsLike(int newFeelsLike){
        this.feelsLike = newFeelsLike;
        notifyObserver();
    }
 
}
