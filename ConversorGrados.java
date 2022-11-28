package grados;
import java.util.Scanner;



/*crea una clase que tiene como parametros un valor introducido como dato, y unos valores en grados celsius y fahrenheit. incluye dos metodos
 * que sirven para convertir el valor introducido por el usuario de grados fahrenheit a celsius y viceversa.
 */
public class ConversorGrados {
	
		private double temp;
		private double fahrenheit;
		private double celsius;
		
		public ConversorGrados(double temp) {
			this.temp=temp;
			}
	    public double getTemp()
	    {
	        return temp;
	    }
		public void setTemp(double temp)
	    {
			this.temp=temp;
	    }
		public double celsiusFahrenheit(double temp) {
			fahrenheit = (temp * 1.8)+32;
			return fahrenheit;
		}
		public double fahrenheitCelsius(double temp) {
			celsius = (temp-32)/1.8;
			return celsius;
		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba el valor de temperatura que quiere convertir de grados fahrenheit celsius y viceversa");
		ConversorGrados temperatura = new ConversorGrados(scan.nextDouble());
		System.out.println(temperatura.getTemp() + " grados celsius equivalen a: " + temperatura.celsiusFahrenheit(temperatura.getTemp()) + " grados fahrenheit");
		System.out.println(temperatura.getTemp() + " grados fahrenheit equivalen a: " + temperatura.fahrenheitCelsius(temperatura.getTemp()) + " grados celsius");
		

	}

}
