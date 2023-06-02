package com.dzhatdoev.emarket.util;

public enum LaptopSize {
    SIZE13((short) 13),
    SIZE14((short) 14),
    SIZE15((short) 15),
    SIZE17((short) 17);

    private short size;

    LaptopSize(short size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
