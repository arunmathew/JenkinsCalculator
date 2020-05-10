package com.arun.jenkins;

import static org.junit.Assert.*;


public class JenkinsCalcTest {

    @org.junit.Test
    public void addNum() {
        JenkinsCalc myCalc = new JenkinsCalc();
        assertEquals(10, myCalc.addNum(7,3));

    }

    @org.junit.Test
    public void subNum() {
        JenkinsCalc myCalc = new JenkinsCalc();
        assertEquals(5, myCalc.subNum(8,3));
        assertNotEquals(5, myCalc.subNum(0,0));
    }
}