package grados;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * Testea con junit los metodos para pasar de grados fahrenheit a celsius y viceversa para los valores -5, 0, 15 y 32
 */
public class ConversorGradosTest {
	

	@Test
	public void testCelsiusFahrenheit1() {
		
		double correcto=23.000;
		ConversorGrados temperatura = new ConversorGrados(-5.0);
		double resultado = temperatura.celsiusFahrenheit(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}
	@Test
	public void testCelsiusFahrenheit2() {
		double correcto=32.000;
		ConversorGrados temperatura = new ConversorGrados(0);
		double resultado = temperatura.celsiusFahrenheit(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}
	@Test
	public void testCelsiusFahrenheit3() {
		double correcto=59.000;
		ConversorGrados temperatura = new ConversorGrados(15);
		double resultado = temperatura.celsiusFahrenheit(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}
	@Test
	public void testCelsiusFahrenheit4() {
		double correcto=89.600;
		ConversorGrados temperatura = new ConversorGrados(32);
		double resultado = temperatura.celsiusFahrenheit(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}

	@Test
	public void testFahrenheitCelsius1() {
		double correcto=-20.555555555555554;
		ConversorGrados temperatura = new ConversorGrados(-5.0);
		double resultado = temperatura.fahrenheitCelsius(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}
	@Test
	public void testFahrenheitCelsius2() {
		double correcto=-17.77777777777778;
		ConversorGrados temperatura = new ConversorGrados(0);
		double resultado = temperatura.fahrenheitCelsius(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}
	@Test
	public void testFahrenheitCelsius3() {
		double correcto=-9.444444444444445;
		ConversorGrados temperatura = new ConversorGrados(15);
		double resultado = temperatura.fahrenheitCelsius(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}
	@Test
	public void testFahrenheitCelsius4() {
		double correcto=0.0000;
		ConversorGrados temperatura = new ConversorGrados(32);
		double resultado = temperatura.fahrenheitCelsius(temperatura.getTemp());
		assertEquals(correcto, resultado,0);
	}
}
