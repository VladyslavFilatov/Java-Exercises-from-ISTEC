package com.company;

public class Main {

    public static void main(String[] args) {
        int x,y;
        //for(x=0,y=3;x<4;x++)y+=x;
        //x=1;y=4; while(x++<3)y +=3;
        //for(x=1,y=0;x<4;x++)y=(x%2==0)?2:3;
        x=1;y=2;
        while(x++<4){
            switch(x){ case 0: case 1:
                y+=x;
                break;
                default:
                    y+=3;
                    break;
            }}

        System.out.println("x: " + x + " Y: " + y);

    }
}
