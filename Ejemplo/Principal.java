public class Principal
{
	public static void main(String[] args)
	{
		// Inicio de Instancia de las clases
		Persona per = new Persona();
		Cliente cli = new Cliente();
		Empleado emp = new Empleado();
		// Fin de Instancia de las clases
		

		// Uso de los atributos de la clase padre
		cli.ci_persona = 7918446;
		cli.nombre = "Gonzalo";
		cli.paterno = "Salazar";
		cli.materno = "Velasquez";
		cli.fecha_nacimiento = "1992-03-01";
		cli.direccion = "6to anillo avenida bolivia nro 234";
		cli.sexo = 1;
		cli.telefono = "+591 77355967";
		cli.fecha_registro = "2014-05-20";
		// Uso de atributos propios de 'Cliente'
		cli.id_cliente = 1;
		cli.nit = 89746546;


		emp.ci_persona = 654654;
		emp.nombre = "Carolina";
		emp.paterno = "Medina";
		emp.materno = "San Julian";
		emp.fecha_nacimiento = "1990-05-18";
		emp.direccion = "Colombia Curumbao #234";
		emp.sexo = 'F';
		emp.telefono = "+191 334564687";
		emp.fecha_registro = "2014-05-20";
		// Atributos propios de Empleado
		emp.id_empleado = 2;
		emp.estado = true;


		cli.imprimirDatos();
		cli.imprimeAtributosPropios();

		emp.imprimirDatos();
		emp.imprimeAtributosPropios();

	}
}