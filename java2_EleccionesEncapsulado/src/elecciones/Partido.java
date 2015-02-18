package elecciones;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class Partido extends EspacioPublico {
	
	private int id;
	private String nombre;
	private String siglas;
	private int afiliados;
	private String secretario;
	
	String cadena;
	int num;
	Scanner sc = new Scanner(System.in);
		
	public Partido(){}
	
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

	public void setSiglas(String siglas){
		this.siglas=siglas;
	}
	public String getSiglas(){
		return siglas;
	}

	public void setAfiliados(int afiliados){
		this.afiliados=afiliados;
	}

	public int getAfiliados()
	{
		return afiliados;
	}
	public void setSecretario(String secretario){
		this.secretario=secretario;
	}
	public String getSecretario(){
		return secretario;
	}
	protected void crearPartido(){
		System.out.print("\nId del partido: ");
		num = sc.nextInt();
		setId(num);
		System.out.print("\nNombre del partido: ");
		cadena = sc.next();
		setNombre(cadena);
		System.out.print("\nSiglas del partido: ");
		cadena = sc.next();
		setSiglas(cadena);
		System.out.print("\nNumero de afiliados en el partido: ");
		num = sc.nextInt();
		setAfiliados(num);
		System.out.print("\nNombre del secretario general: ");
		cadena = sc.next();
		setSecretario(cadena);
		System.out.println("-----------Informacion del Partido-----------");
		System.out.println("El id del partido es: " + getId()+ "");
		System.out.println("El nombre del partido es: " + getNombre()+ "");
		System.out.println("Las siglas del partido son" + getSiglas()+ "");
		System.out.println("El numero de afiliados es: " + getAfiliados()+ "");
		System.out.println("El nombre del secretario general es: " + getSecretario()+ "\n");
		
	}
	protected void leerMostar(){
		try{
			
			
			File listaPartido = new File("C:/Users/Mikel/git/java2_elecEncapsulado/java2_EleccionesEncapsulado/src/elecciones/listadoPartidos.txt");
			FileInputStream fis = new FileInputStream(listaPartido);
	        InputStreamReader isr = new InputStreamReader(fis, "UTF8");
	        BufferedReader br = new BufferedReader(isr);
	        
	        String linea;
	        linea = br.readLine();
	        String [] campos = null;
	        System.out.println("\ntus partidos...");
	        
	        while(linea!=null){
	        	campos = linea.split(",");
	        	System.out.println("-----------Informacion del Partido-----------");
	        	System.out.println("id: "+campos[0]);
	       		System.out.println("nombre: "+campos[1]);
	       		System.out.println("siglas: "+campos[2]);
	       		System.out.println("afiliados: "+campos[3]);
	       		System.out.println("secretario: "+campos[4]);
	       		
	       		
	       		linea = br.readLine();
	       		br.close();
	        }
		}catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }
       
	}

}
