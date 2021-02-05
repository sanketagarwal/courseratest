/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanket Agarwal
 */
public class Access {
    int a;
    public int b;
    private int c;
    
void setc(int i){
c=i;
}
int getc(){
    return c;
}
}
class GetSet {
    public static void main(String[] args){
        Access ob = new Access();
        ob.a=10;
        ob.b=12;
        ob.setc(100);
        System.out.println(ob.a+ob.getc()+ob.b);
    }
}