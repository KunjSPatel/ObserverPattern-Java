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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TempSubject tempSubject = new TempSubject();
  
        TempObserver observer1 = new TempObserver(tempSubject);
  
        tempSubject.setHigh(10);
        tempSubject.setLow(4);
        tempSubject.setFeelsLike(0);
  
        TempObserver observer2 = new TempObserver(tempSubject);
  
        tempSubject.setHigh(11);
        tempSubject.setLow(6);
        tempSubject.setFeelsLike(2);
  
        tempSubject.remove(observer2);
  
        tempSubject.setHigh(2);
        tempSubject.setLow(7);
        tempSubject.setFeelsLike(3);
        
        TempObserver observer3 = new TempObserver(tempSubject);
        
    }
    
}
