/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.method.factorial;

/**
 *
 * @author hassn
 */
public class MethodFactorial {

     public static void main(String[] args) {
        System.out.println("factorial method tasks");
         
        
        int f=5;
        System.out.println("Result is = " + fac(f));

    }

    public static int fac(int f) {
        if (f == 1)
        {
            return 1;
        }
        else
        {
             return f*fac(f-1);           
        }
    }
}
