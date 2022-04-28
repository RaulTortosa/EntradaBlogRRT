package entornos;

public class EntradaBlogRRT {

	/**separador es el car�cter que separa 
	 * "ENTRADA DE" del nombre del autor
	 * Raul Rodriguez Tortosa 28/04/2022
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
	 * de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
	 * es negativo, lanza una excepci�n.
	 * Raul Rodriguez Tortosa 28/04/2022
	 */
	public EntradaBlogRRT(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/** Devuelve el n�mero de la entrada
	 * Raul Rodriguez Tortosa 28/04/2022
	 */
	public int getId(){
		return this.id;
	}
	
	/** Devuelve el texto completo de la entrada
	 * Raul Rodriguez Tortosa 28/04/2022
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/** Devuelve el nombre del autor de la entrada en may�sculas
	 * Raul Rodriguez Tortosa 28/04/2022
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/** Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * Raul Rodriguez Tortosa 28/04/2022
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/** El main para probar el codigo
	 * Raul Rodriguez Tortosa 28/04/2022
	 */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogRRT e1=new EntradaBlogRRT (-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}
