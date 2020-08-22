/**
 * Interface utilizada para manipular portas
 * @author prof-salu
 *
 */
public interface House {
	/**
	 * @deprecated Metodo obsoleto, em futuras versoes ele sera descontuiado.
	 * Utilize agora openFrontDoor ou openBackDoor
	 */
	
	@Deprecated
	public void open();

	public void openFrontDoor();

	public void openBackDoor();
}
