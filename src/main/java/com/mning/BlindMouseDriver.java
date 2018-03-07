package com.mning;

public class BlindMouseDriver {
    public void solve(BlindMouse mouse) {
        while (mouse.move() != 1) {
            mouse.turn(0);
            if (mouse.move() ==  -1)

            if (mouse.move() == -1) {
                mouse.turn(0);
            } else if (mouse.move() == -1) {
                mouse.turn(1);
            }
        }
    }
}
