public class Cliente extends Persona
{
	public int id_cliente;
	public int nit;

	public void imprimeAtributosPropios()
	{
		System.out.println("Mi ID de Cliente es: " + id_cliente);
		System.out.println("Mi NIT es: " + nit);
		System.out.println("\n");
	}
}