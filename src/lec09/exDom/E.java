package lec09.exDom;

import lec09.visibility.A;

public class E extends A {
    void g() {
        //privateField++;
        protectedField++;
        //packageField++;
        publicField++;
    }
}
