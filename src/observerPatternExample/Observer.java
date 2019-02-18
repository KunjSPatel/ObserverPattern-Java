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
public interface Observer {
    //Observer Methods
    public void update(int high, int low, int feelsLike);
    
}
