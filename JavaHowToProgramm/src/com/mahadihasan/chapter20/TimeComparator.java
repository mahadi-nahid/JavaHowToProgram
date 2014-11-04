
package com.mahadihasan.chapter20;

import com.mahadihasan.chapter08.Time2;
import java.util.Comparator;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class TimeComparator implements Comparator<Time2> {

    @Override
    public int compare(Time2 time1, Time2 time2) {
        
        int hourCompare = time1.getHour()- time2.getHour();
        
        if(hourCompare != 0)
            return hourCompare;
        
        int minuteCompare = time1.getMinute()- time2.getMinute();
        
        if(minuteCompare != 0)
            return minuteCompare;
        
        int secondCompare = 
                time1.getSecond() - time2.getSecond();
        
        return secondCompare;
        
    }
    
    
}
