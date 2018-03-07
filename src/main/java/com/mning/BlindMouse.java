package com.mning;

public class BlindMouse {
    private int direction;

    public int move() {
        return 0;
    } // 0 == ok, 1 == exit, -1 == blocked

    public void turn(int direction) {
        this.direction = direction;
    }// 0 == left; 1 == right;
}
