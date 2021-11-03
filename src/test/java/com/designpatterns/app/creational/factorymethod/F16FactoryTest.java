package com.designpatterns.app.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class F16FactoryTest {
    @Test
    public void testFactoryF16Creation() {
        F16SimpleFactory f16SimpleFactory = new F16SimpleFactory();
        F16 f16A = f16SimpleFactory.makeF16("A");
        F16 f16B = f16SimpleFactory.makeF16("B");

        f16A.fly();
        f16B.fly();
        assertNotEquals(f16A, f16B);
    }

    @Test
    public void testFactoryMethodPatternF16() {
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        F16 secondF16B = f16B.makeF16();
        assertNotEquals(f16A, f16B);
        assertNotEquals(f16A.engine, secondF16B.engine);
    }
}
