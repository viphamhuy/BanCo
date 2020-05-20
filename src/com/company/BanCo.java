package com.company;

public class BanCo implements IBanCo {
    private int x;
    private int y;

    public BanCo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public boolean diChuyen(BanCo x, BanCo y) {
        if ((x.getX() + x.getY()) % 2 == (y.getX() + y.getY()) % 2) {
            return true;
        }
        return false;
    }
}
