package com.ale.designpattern.creationalpattern.builder;

public interface Builder {
    Builder doors(int doors);
    Builder windows(int windows);
    Builder roof(boolean roof);
    Builder garage(boolean garage);
    Builder color(String color);
    House build();
}
