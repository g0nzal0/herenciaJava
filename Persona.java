public class Persona
{
	String nombre;
	String sexo;
	int edad;

	public void imprimeSaludo()
	{
		System.out.println("Hola Soy una persona: ");
	}

	public void imprimeDatosPrincipales()
	{
		System.out.println("HOLA :D ");
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi Sexo es: " + sexo);
		System.out.println("Mi edad es: " + edad);
		
	}
}