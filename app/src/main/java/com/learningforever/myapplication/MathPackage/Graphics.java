package com.learningforever.myapplication.MathPackage;

/**
 * Created by ABCD on 5/13/2017.
 */
public class Graphics {
    double[] sines;
    double[] cosines;
    {
        sines = new double[360];
        cosines = new double[sines.length];
        for (int degree = 0; degree < sines.length; degree++)
        {
            sines[degree] = Math.sin(Math.toRadians(degree));
            cosines[degree] = Math.cos(Math.toRadians(degree));
        }
        char gradeLetters[] = { 'A', 'B', 'C', 'D', 'F' };
        char[] gradeLettersa = { 'A', 'B', 'C', 'D', 'F' };
        char gradeLettsers[] = new char[] { 'A', 'B', 'C', 'D', 'F' };
    }
}
