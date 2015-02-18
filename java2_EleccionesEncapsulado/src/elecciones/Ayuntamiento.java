package elecciones;

public final class Ayuntamiento extends EspacioPublico {
	
	private String nombreAlcalde;
	
	public Ayuntamiento(){}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}

	public void setPoblacion(String poblacion){
		this.poblacion=poblacion;
	}
	public String getPoblacion(){
		return poblacion;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public String getDireccion(){
		return direccion;
	}

	public void setNombreAlcalde(String nombreAlcalde){
		this.nombreAlcalde=nombreAlcalde;
	}

	public String getNombreAlcalde(){
		return nombreAlcalde;
	}
	public void crearAyuntamiento(){
		
		System.out.print("\nID del ayuntamiento: ");
		num = sc.nextInt();
		setId(num);
		System.out.print("\nPoblacion del ayuntamiento: ");
		cadena = sc.next();
		setPoblacion(cadena);
		System.out.print("\nLa direccion del ayuntamiento: ");
		cadena = sc.next();
		setDireccion(cadena);
		System.out.print("\nEl nombre del alcalde: ");
		cadena = sc.next();
		setNombreAlcalde(cadena);
		System.out.println("\n-----------Informacion del ayuntamiento-----------");
		System.out.println("El ID del ayuntamiento es: " + getId()+ "");
		System.out.println("La poblacion del ayuntamiento es: " + getPoblacion()+ "");
		System.out.println("La direcciondel ayuntamiento es: " + getDireccion()+ "");
		System.out.println("El nombre del alcalde es: " + getNombreAlcalde()+ "\n");
	}
}
