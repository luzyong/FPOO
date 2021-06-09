/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author Luz Yong
 */
public class area {

    float b;
    float h;
    float a;
    float p;
    public area()
    {
        this.a = 0;
        this.p = 0;
        this.b = 0;
        this.h = 0;
    }
    public float OArea()
    {
        a=(b*h);
        return a;
    }
    public float Oper()
    {
        p=(2*(b+h));
        return p;
    }
    public float B()
     {
        Scanner var = new Scanner(System.in);
        b = var.nextInt();
        return b;
    }     
    public float H()
     {
        Scanner var = new Scanner(System.in);
        h = var.nextInt();
        return h;
    }     
}
