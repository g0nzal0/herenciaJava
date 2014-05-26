public class Empleado extends Persona
{
	public int id_empleado;
	public boolean estado;

	public void imprimeAtributosPropios()
	{
		System.out.println("Mi ID de Empleado es: " + id_empleado);
		
		if (estado)
			System.out.println("Mi estado es: Habilitado" );
		else 
			System.out.println("Mi estado es: Desabilitado" );

		System.out.println("\n");
	}
}