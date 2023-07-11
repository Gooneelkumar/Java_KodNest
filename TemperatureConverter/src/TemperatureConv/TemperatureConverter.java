package TemperatureConv;

public class TemperatureConverter {

	public double convertFahrenheitToCelsius(double fahrenheit)
	{
		double Celsius;
		Celsius = ((fahrenheit - 32) * 5/9);
		return Celsius;
	}
}
