package elecciones;

import java.util.Scanner;

public final class Habitante extends EspacioPublico {

	public String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private String sexo;
	private int telefono;
	private String poblacion;

	String cadena;
	int num;
	Scanner sc = new Scanner(System.in);
	
	public Habitante(){}

	public void setNombre(String n)
	{
		this.nombre=n;
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setApellido(String a)
	{
		this.apellido=a;
	}
	public String getApellido()
	{
		return apellido;
	}

	public void setDni(String d)
	{
		this.dni=d;
	}
	public String getDni()
	{
		return dni;
	}

	public void setEdad(int e)
	{
		this.edad=e;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setSexo(String s)
	{
		this.sexo=s;
	}
	public String getSexo()
	{
		return sexo;
	}

	public void setTelefono(int t)
	{
		this.telefono=t;
	}
	public int getTelefono()
	{
		return telefono;
	}
	public void setPoblacion(String p)
	{
		this.poblacion=p;
	}

	public String getPoblacion()
	{
		return poblacion;
	}
	
	protected void crearHabitante(){
		
		System.out.print("\nNombre del habitante: ");
		cadena = sc.next();
		setNombre(cadena);
		System.out.print("\nApellido del habitante: ");
		cadena = sc.next();
		setApellido(cadena);
		System.out.print("\nDNI del habitante: ");
		cadena = sc.next();
		setDni(cadena);
		System.out.print("\nEdad del habitante: ");
		num = sc.nextInt();
		setEdad(num);
		System.out.print("\nSexo del habitante: ");
		cadena = sc.next();
		setSexo(cadena);
		System.out.print("\nTelefono del habitante: ");
		num = sc.nextInt();
		setTelefono(num);
		System.out.print("\nPoblacion del habitante: ");
		cadena = sc.next();
		setPoblacion(cadena);
		
		System.out.println("-----------Informacion del habitante-----------");
		System.out.println("El nombre del habitante es: " + getNombre()+ "");
		System.out.println("El apellido del habitante es: " + getApellido()+ "");
		System.out.println("El DNI del habitante es: " + getDni()+ "");
		System.out.println("La edad del habitante es: " + getEdad()+ "");
		System.out.println("El sexo del habitante es: " + getSexo()+ "");
		System.out.println("El telefono del habitante es: " +getTelefono()+ "");
		System.out.println("La poblacion del habitante es: " + getPoblacion()+ "\n");
		
	}
	
}
