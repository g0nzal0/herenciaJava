public class Profesor extends Persona
{
	String escuela;
	int nro_alumno;

	public void imprimeMisAtributos()
	{
		System.out.println("Mi escuela es: " + escuela);
		System.out.println("Mi numero de alumnos son: " + nro_alumno);
		System.out.println("\n");
	}
}