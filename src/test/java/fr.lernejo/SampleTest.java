package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void op(){
        assertEquals(92, new Sample().op(Sample.Operation.ADD,90,2));
        assertEquals(20,new Sample().op(Sample.Operation.MULT,10,2));


    }
    @Test
    void fact(){
        assertEquals(120, new Sample().fact(5));
        assertThrows(IllegalArgumentException.class,() -> new Sample().fact(-1));
    }
}
