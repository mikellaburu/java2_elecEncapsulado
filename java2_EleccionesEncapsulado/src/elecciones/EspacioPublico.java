package elecciones;

import java.util.Scanner;

class EspacioPublico {
	
	protected int id;
	protected String direccion;
	protected String poblacion;
	
	private String nombre;
	private String tipo;
	private int metros;
	
	String cadena;
	int num;
	Scanner sc = new Scanner(System.in);
	

	public EspacioPublico(){}

	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}

	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public String getTipo(){
		return tipo;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public String getDireccion(){
		return direccion;
	}

	public void setPoblacion(String poblacion){
		this.poblacion=poblacion;
	}
	public String getPoblacion(){
		return poblacion;
	}

	public void setMetros(int metros){
		this.metros=metros;
	}
	public int getMetros(){
		return metros;
	}
	protected void crearEspacioPublico(){
		
		System.out.print("\nID del espacio publico: ");
		num = sc.nextInt();
		setId(num);
		System.out.print("\nNombre del espacio publico: ");
		cadena = sc.next();
		setNombre(cadena);
		System.out.print("\nTipo de espacio publico: ");
		cadena = sc.next();
		setTipo(cadena);				
		System.out.print("\nLa direccion del espacio publico: ");
		cadena = sc.next();
		setDireccion(cadena);
		System.out.print("\nLa poblacion del espacio publico: ");
		cadena = sc.next();
		setPoblacion(cadena);
		System.out.print("\nMetros del espacio publico: ");
		num = sc.nextInt();
		setMetros(num);

		System.out.println("\n-----------Informacion del espacio publico-----------");
		System.out.println("El ID del espacio publico es: " + getId()+ "");
		System.out.println("El nombre del espacio publico es: " + getNombre()+ "");
		System.out.println("El tipo del espacio publico es: " + getTipo()+ "");
		System.out.println("La direccion del espacio publico es: " + getDireccion()+ "");
		System.out.println("La poblacion del espacio publico es: " + getPoblacion()+ "");
		System.out.println("Los metros del espacio publico es: " + getMetros()+ "\n");
		
	}

}
