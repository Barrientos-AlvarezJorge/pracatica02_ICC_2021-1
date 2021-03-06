//Actividad 5*******************************************
/**
 *Clase que representa una mascota
 *@author Jorge Miguel Aaron Barrientos Alvarez. NC: 421111666
 *@version 1.0 Octubre 2020
 *@since Laboratorio de ICC 2021-1
 */

public class Mascota{

    /**Nombre de la mascota*/
    public String nombreMascota;

    /**Edad de la mascota */
    public int edadMascota;

    /**Color de la mascota*/
    public String color;

    /**Dueño de la mascota */
    public String dueño;

    /**Mejor amigo de la mascota*/
    public String amigo;
    
    //Metodo constructor
    /**
     *Crea una mascota
     *@param nombre de la mascota
     *@param edad de la mascota
     *@param color de la mascota
     *@param dueño de la mascota
     *@param mejor amigo de la mascota 
     */

    public Mascota(String nombreMascota, int edadMascota, String color){
	this.nombreMascota=nombreMascota;
	this.edadMascota=edadMascota;
	this.color=color;
	this.amigo="";
	this.dueño="";
    }

    //Metodos de acceso
    /**
     *Regresa el nombre de la mascota
     *@return el nombre de la mascota
     */

    public String getNombreMascota(){
	return nombreMascota;
    }

     /**
     *Regresa la edad de la mascota
     *@return la edad de la mascota
     */

    public int getEdadMascota(){
	return edadMascota;
    }

     /**
     *Regresa el color de la mascota
     *@return el color de la mascota
     */

    public String getColor(){
	return color;
    }

     /**
     *Regresa el nombre del dueño de la mascota
     *@return el nombre del dueño de la mascota
     */

    public String getDueño(){
	return dueño;
    }

     /**
     *Regresa el nombre del mejor amigo de la mascota
     *@return el nombre del mejor amigo de la mascota
     */

    public String getAmigo(){
	return amigo;
    }

    //toString
    /**
     *toString que regresa el nombre de la mascota, de su dueño y de su mejor amigo
     *@return nombre de la mascota, de su dueño y de su mejor amigo
     */

    public String toString(){
	return "Nombre de la mascota: "+this.nombreMascota+"\n"+"Su mejor amigo es: "+this.amigo+"\n"+"Su dueño es: "+this.dueño;
    }

    //Metodos mutantes

    /**
     *Modifica el nombre de la mascota
     *@param nuevo nombre de la mascota
     */

    public void setNombreMascota(String nombreMascota){
	this.nombreMascota=nombreMascota;
    }

     /**
     *Modifia la edad de la mascota
     *@param nueva edad de la mascota
     */

    public void setEdadMascota(int edadMascota){
	this.edadMascota=edadMascota;
    }

     /**
     *Modifica el color de la mascota
     *@param nuevo color de la mascota
     */

    public void setColor(String color){
	this.color=color;
    }

     /**
     *Modifica el dueño de la mascota
     *@param nuevo dueño de la mascota
     */

    public void setDueño(String dueño){
	this.dueño=dueño;
    }

     /**
     *Modifica el mejor amigo de la mascota
     *@param nuevo mejor amigo de la mascota
     */

    public void setAmigo(String amigo){
	this.amigo=amigo;
    }
    
    //Metodo que permite que dos mascotas se hagan mejores amigos mutuamente.
    public static void setMejoresAmigos(Mascota mascota1, Mascota mascota2){
	mascota1.setAmigo(mascota2.getNombreMascota());
	mascota2.setAmigo(mascota1.getNombreMascota());
    }
    
    public static void setDueñoMascota(Mascota mascota, Persona persona){
	mascota.setDueño(persona.getNombre());
	persona.setMascota(mascota.getNombreMascota());
    }
    
    public static void main(String[] args){
	//Creación de las mascotas
	Mascota mascota1=new Mascota("El Mañas", 1, "Amarillo");
	Mascota mascota2=new Mascota("Luna", 1, "Tricolor");
	Mascota mascota3=new Mascota("Tomas", 1, "Gris");
	Mascota mascota4=new Mascota("El wero", 1, "Amarillo");
	Mascota mascota5=new Mascota("Zelda", 3, "Gris");
	Mascota mascota6=new Mascota("Demian", 2, "Gris");

	//Creación de las personas
      	Persona persona1= new Persona ("Ramon");
	Persona persona2= new Persona ("Aaron");
	Persona persona3= new Persona ("Joy");
	Persona persona4= new Persona ("Jorge");
	Persona persona5= new Persona ("Javier");
	Persona persona6= new Persona ("Laville");
	
	//Hacer que dos mascotas se hagan mejores amigos
	setMejoresAmigos(mascota1, mascota2);
	setMejoresAmigos(mascota3, mascota4);
	setMejoresAmigos(mascota5, mascota6);

	//Hacer que cada mascota tenga un dueño y que cada dueño tenga una mascota
	setDueñoMascota(mascota1, persona1);
	setDueñoMascota(mascota2, persona2);
	setDueñoMascota(mascota3, persona3);
  	setDueñoMascota(mascota4, persona4);
	setDueñoMascota(mascota5, persona5);
	setDueñoMascota(mascota6, persona6);

	//Impresión de las mascotas: nombre, nombre del dueño y nombre del mejor amigo
	System.out.println(mascota1+"\n");
	System.out.println(mascota2+"\n");
	System.out.println(mascota3+"\n");
	System.out.println(mascota4+"\n");
	System.out.println(mascota5+"\n");
	System.out.println(mascota6+"\n");
    
    }
    
}
