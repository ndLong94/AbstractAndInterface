package Subclass;

import interfaces.ToNumber;

/**
 * Created by LongND14 on 7/13/2017.
 */
public class Number implements ToNumber {
    private int number;
    @Override public int getNumber() {
        return number;
    }

    public Number( int number ) {
        this.number = number;
    }
}
