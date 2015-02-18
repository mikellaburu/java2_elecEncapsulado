package elecciones;

import java.util.Scanner;

public final class Inmueble  extends EspacioPublico{
	
	private int id;
	private String tipo;
	private String direccion;
	private int metros;
	Scanner sc = new Scanner(System.in);
	String cadena;
	int num;
	

	public Inmueble(){}

	
	public void setId(int i){
		this.id=i;
	}
	public int getId()
	{
		return id;
	}

	public void setTipo(String t)
	{
		this.tipo=t;
	}
	public String getTipo()
	{
		return tipo;
	}

	public void setDireccion(String d)
	{
		this.direccion=d;
	}
	public String getDireccion()
	{
		return direccion;
	}

	public void setMetros(int m)
	{
		this.metros=m;
	}

	public int getMetros()
	{
		return metros;
	}
	protected void crearInmueble(){
	

	
		System.out.print("\nID del inmueble: ");
		num = sc.nextInt();
		setId(num);
		System.out.print("\nTipo de inmueble: ");
		cadena = sc.next();
		setTipo(cadena);
		System.out.print("\nLa direccion del inmueble: ");
		cadena = sc.next();
		setDireccion(cadena);
		System.out.print("\nMetros del inmueble: ");
		num = sc.nextInt();
		setMetros(num);
		
		System.out.println("-----------Informacion del inmueble-----------");
		System.out.println("El ID del inmueble es: " + getId()+ "");
		System.out.println("El tipo de inmueble es: " + getTipo()+ "");
		System.out.println("La dirrecion del inmueble es: " + getDireccion()+ "");
		System.out.println("Los metros del inmueble son: " + getMetros()+ "\n");
		
	}

	
}
