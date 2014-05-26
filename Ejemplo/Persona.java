public class Persona
{
	public int ci_persona;
	public String nombre;
	public String paterno;
	public String materno;
	public String fecha_nacimiento;
	public String direccion;
	public char sexo;			// [1=>M] [2=>F] [3>=O]
	public String telefono;
	public String fecha_registro;

	public void imprimirDatos()
	{
		System.out.println("HOLA");
		System.out.println("Mi CI es: " + ci_persona);
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi apellido paterno es: " + paterno);
		System.out.println("Mi apellido materno es: " + materno);
		System.out.println("Mi fecha nacimiento es: " + fecha_nacimiento);
		System.out.println("Mi direccion es: " + direccion);
		
		switch(sexo)
		{
			case 1:
				System.out.println("Mi sexo es: Masculino");
				break;
			case 2:
				System.out.println("Mi sexo es: Femenino");
			break;

			case 3:
				System.out.println("Mi sexo es: Hermofrodita");
				break;
		}	

		System.out.println("Mi telefono es: " + telefono);
		System.out.println("Mi fecha registro es: " + fecha_registro);
	}

}