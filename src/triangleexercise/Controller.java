/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleexercise;

/**
 *
 * @author Jonathan
 */
public class Controller {

    public Controller() {

    }

    public int findShapeOfTriangle(int a, int b, int c) {
        //Checks if its scalene 
        // check if a| b | c is 0
        // Check if the sum is bigger than int
        // Check if its a triangle
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        } else if (a != b && a != c && b != c) {
            return 3;
        } //Checks if its isosceles   
        else if (a == b && b != c || a == c && c != b || b == c && b != a) {
            return 2;
        } //Checks if its equilateral 
        else if (a == b && b == c) {
            return 1;
        } else {
            //Should never be returned.
            return -100;
        }

    }
}
