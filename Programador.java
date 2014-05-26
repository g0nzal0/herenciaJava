public class Programador extends Persona
{
	String os_favorito;
	String marca_pc;

	public void imprimeMisAtributos()
	{
		System.out.println("Mi Sistema Operativo favorito es: " + os_favorito) ;
		System.out.println("Mi PC favorito es: " + marca_pc);
		System.out.println("\n");
	}
}