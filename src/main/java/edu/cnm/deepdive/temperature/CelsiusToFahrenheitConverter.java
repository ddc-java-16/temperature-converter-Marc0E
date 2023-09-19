package edu.cnm.deepdive.temperature;

public class CelsiusToFahrenheitConverter {

  private static final double SCALING_FACTOR = 1.8; //We use "final" because the value cant change

  public double convert(double celsius){

    return SCALING_FACTOR * celsius + 32;
  }

}
