
public class Bolera {
	private String nom;
	private int edad;
	private int dni;
	
	public Bolera(String nom, int edad, int dni){
		this.nom  = nom;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String imprimir(){
		String msg = "";
		System.out.println("["+nom+","+edad+","+dni+"]");
		return msg;
	}
	
}
