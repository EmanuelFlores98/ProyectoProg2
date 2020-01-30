public class Promedio{
	public static void main (String [] args){
		int num1 = 6;
		int num2 = 7;
		int num3 = 7;
		float promedio = (num1+num2+num3)/3;
		System.out.println("El promedio es: " +promedio+ " suerte!! ");
		if(promedio>8.5f){
			System.out.println("Obtiene beca");
		}else{
			System.out.println("No obtiene beca");
		}
	}
}