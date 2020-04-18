/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Timer {
    private ClockHand hundred;
    private ClockHand seconds;

    public Timer() {
        this.hundred = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundred.advance();

        if (this.hundred.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds.toString() + ":" + this.hundred.toString();
    }
}
