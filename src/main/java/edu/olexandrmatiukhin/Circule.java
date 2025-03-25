package edu.olexandrmatiukhin;/*
@author sasha
@project lab2
@class Circule
@version 1.0.0
@since 16.03.2025 - 19 - 31
*/

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class Circule {
    private double radius;

    public Circule(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Довжина кола
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Площа круга
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Перевод велечини кута з градусів у радіани
    public double getAngleInRadians(double angleInDegrees){
        return angleInDegrees * Math.PI/180;
    }

    // Отримати довжину сегменту за величиною кута в радіанах
    public double getArcLength(double angleInRadians){
        return  radius * angleInRadians;
    }

    // Отримати площу сектора за величиною кута в радіанах
    public double getSectorArea (double angleInRadians){
        return radius * radius * angleInRadians / 2;
    }

    // Отримати діагональ круга
    public double getDiagonale() {
        return radius * 2;
    }

    // Отримати сторону вписанного квадрата
    public double getInscribedSquareSide(){
        return radius * sqrt(2);
    }

    // Отримати сторону описанного квадрата
    public double  getCircumscribedSquareSide(){
        return radius * 2;
    }

    // Отримати сторону вписанного рівностороннього трикутника
    public double getInscribedEquilateralTriangleSide(){
        return 2 * radius * sin(getAngleInRadians(60));

    }

    // Отримати сторону описанного рівностороннього трикутника-
    public double getCircumscibedEquilateralTriangleSide(){
        return 2 * radius * sqrt(3);
    }



}
