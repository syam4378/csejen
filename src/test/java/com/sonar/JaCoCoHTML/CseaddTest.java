package com.sonar.JaCoCoHTML;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CseaddTest {

    cseadd c = new cseadd();

    @Test
    void addTest() {
        int result = c.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void mulTest() {
        int result = c.mul(2, 3);
        assertEquals(6, result);
    }
}
