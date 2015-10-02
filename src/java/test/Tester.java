/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import generators.DataGenerator;

/**
 *
 * @author simon
 */
public class Tester {
    public static void main(String[] args) {
        new Tester().test();
    }
    
    public void test() {
        System.out.println(DataGenerator.getData(4, "city"));
    }
}
