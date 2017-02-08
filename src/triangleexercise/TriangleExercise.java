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
public class TriangleExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 == equilateral // lige lange
        //2 == isosceles // ligebennet 
        //3 == scalene // alle er forskellige
        Controller c = new Controller();
        System.out.println(c.calcTriangle(0, 0, 0));
        System.out.println(c.calcTriangle(1, 1, 0)); 
        System.out.println(c.calcTriangle(3, 4, 5));
        System.out.println(c.calcTriangle(2, 2, 4)); 
        System.out.println(c.calcTriangle(4, 4, 2)); 
        System.out.println(c.calcTriangle(3, 3, 3)); 
        
        

    }

}
