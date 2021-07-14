package com.example.android.numbershapes;

public class Numbers {


    int myNumber;

    public boolean isSquare (){

        double squareRoot = Math.sqrt(myNumber);
        if(squareRoot == Math.floor(squareRoot)){

            return true;
        }
        else {
            return false;
        }
    }

    public boolean isTriangular (){

        int x = 1;
        int traingular = 1;

        if (traingular < myNumber){

            x++;
            traingular = traingular +x;

        }if (traingular == myNumber){

            return true;
        }else {

            return false;
        }
    }

}

