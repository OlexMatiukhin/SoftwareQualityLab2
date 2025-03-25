package edu.olexandrmatiukhin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
@author sasha
@project lab2
@class CirculeTest
@version 1.0.0
@since 16.03.2025 - 22 - 25
*/public class CirculeTest {

    private final Circule circule = new Circule(3);

    @Test
    public void whenRadiusIs_3_ThenCircumferenceIs_18_Point_84() {
        assertEquals(circule.getCircumference(), 18.84, 0.01);
    }

    @Test
    public void whenRadiusIs_3_ThenAreaIs_28_Point_26_() {
        assertEquals(circule.getArea(),28.27, 0.01);
    }

    @Test
    public void whenRadiusIs_3_AndAngelInDegreesIs_60_ThenAngleInRadiansIs_1_Point_047() {
        assertEquals(circule.getAngleInRadians(60),1.047, 0.01);
    }

    @Test
    public void whenRadiusIs_3_AndAngelInRadiansIs_1Point_047_ThenArcLengthIs_3_Point141 () {
    assertEquals(circule.getArcLength(1.047), 3.141,0.01);
    }

    @Test
    public void whenRadiusIs_3_AndAngelInRadiansIs_1_Point_047_ThenSectorAreaIs_4_Point_712() {
        assertEquals(circule.getSectorArea(1.047),4.712,0.01);
    }

    @Test
    public void whenRadiusIs_3_ThenDiagonaleIs_6() {
        assertEquals(circule.getDiagonale(),6,0.01);
    }

    @Test
    public void WhenRadiusIs_3_ThenInscribedSquareSideIs_4_Point_24() {
        assertEquals(circule.getInscribedSquareSide(),4.24,0.01);
    }

    @Test
    public void WhenRadiusIs_3_ThentCircumscribedSquareSideIs_6 () {
        assertEquals(circule.getCircumscribedSquareSide(),6,0.01);
    }

    @Test
    public void WhenRadiusIs_3ThenInscibedEquilateralTriangleSideIs_5_Point_196() {
        assertEquals(circule.getInscribedEquilateralTriangleSide(),5.19,0.01);
    }

    @Test
    public void WhenRadiusIs_3ThenCircumscibedEquilateralTriangleSideIs_10_Point_39() {
        assertEquals(circule.getCircumscibedEquilateralTriangleSide(),10.39,0.01);
    }
}