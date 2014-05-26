public class Main
{
	public static void main(String[] args)
	{
		Persona personas = new Persona();
		Programador programador = new Programador();
		Profesor profesor = new Profesor();
		Futbolista futbolista = new Futbolista();


		/* Utilizando el atributos de la clase Persona */

		// Utilizando atributo 'nombre' de la clase Persona
		programador.nombre = "Gonzalo";
		profesor.nombre = "Zulma";
		futbolista.nombre = "Messi";

		// Utilizando el atributo 'sexo' de la clase Persona
		programador.sexo = "Masculino";
		profesor.sexo = "Femenino";
		futbolista.sexo = "Masculino";


		// Utilizand el atributo 'edad' de la clase Persona
		programador.edad = 22;
		profesor.edad = 50;
		futbolista.edad = 27;


		/* Utilizando atributos propios de cada clase */
		
		// Atributos propios de la clase Programador
		programador.os_favorito = "Linux";
		programador.marca_pc = "Lenovo";

		// Atributos propios de la clase Profesor
		profesor.escuela = "Domingo sabio";
		profesor.nro_alumno = 35;

		// Atributos propios de la clase Futbolista
		futbolista.equipo = "Barcelona";
		futbolista.posicion = "Delantero"; 


		// Todos las Entidades utilizan el metodo Persona [imprimeSaludo]
		
		/*
		programador.imprimeDatosPrincipales();
		programador.imprimeMisAtributos();

		profesor.imprimeDatosPrincipales();
		profesor.imprimeMisAtributos();

		futbolista.imprimeDatosPrincipales();
		futbolista.imprimeMisAtributos();
		*/

		// Definimos un arreglo
		
		Persona[] persona = new Persona[3];

		persona[0] = new Programador();
		persona[1] = new Profesor();
		persona[2] = new Futbolista();

		String[] nombres = {"juan", "carlos", "paola" };
		
		persona[0].nombre = nombres[0];
		persona[1].nombre = nombres[1];
		persona[2].nombre = nombres[2];

		for (Persona p:persona)
		{
			p.imprimeDatosPrincipales();
		}

	}
}