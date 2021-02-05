/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java app;

/**
 *
 * @author Sanket Agarwal
 */
 class overloadingDemo{
    void test(){
        System.out.println("No parameters");               
                           
    } 
    void test(double a){
        System.out.println("Inside test(double) a: " + a);
    
}
    void test(int a, int b){
        System.out.println(" a and b " + a + " " + b);
    }
}
class overloading{ 
public static void main(String args[]){
    overloadingDemo ob = new overloadingDemo();
    int i = 88;
    ob.test();
    ob.test(10,20);
    ob.test(i);
    ob.test(123.2);
}
}
