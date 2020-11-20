package com.week7;

public class CircleApp {

    /**
     * @ClassName CircleApp
     * @Description TODO
     * @Author yoRoll.z
     * @Date 2020/10/28
     **/

        public static void main(String[] args){
            Point point=new Point(10,20);
            Circle circle=new Circle(10,20,30);
            Cylinder cylinder=new Cylinder(10,10,5,4);
            point.print();
            circle.print();
            cylinder.print();
        }
    }


