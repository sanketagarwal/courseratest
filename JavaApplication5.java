/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Sanket Agarwal
 */

    class Box{
        double width;
        double height;
        double depth;
      
    
    Box(double w, double h, double d){
        width =w;
        height =h;
        depth = d;
            
}
    double volume(){
        return depth * height * width;
    }
}
    
class BoxDemo7{
    public static void main(String args[]){
        Box mybox1 =new Box(10,12,13);
        Box mybox2 =new Box(11,12,13);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
}
    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
}
  

