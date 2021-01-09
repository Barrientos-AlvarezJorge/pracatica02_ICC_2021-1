/**
 *Clase que representa una persona
 *@author Jorge Miguel Aaron Barrientos Alvarez. NC: 421111666
 *@version 1.0 Octubre 2020
 *@since Laboratorio de ICC 2021-1
 */

public class Persona{
    //Actividad 5*****************************************************
    public String mascota;
    
    //Actividad 4******************************************************
    /**Contador para saber cuántas instancias Persona se han creado */
    public static int contador=0;
    
    //ACTIVIDAD 1*******************************************************
    /** Nombre de la persona. */
    public String nombre;

    /** Edad de la persona*/
    public int edad;

    /** Estatura de la persona en centímetros*/
    public int estatura;

    /**Usa lentes */
    public boolean usaLentes;
    
    /**Color de cabello*/
    public String colorCabello;

     /**Ingresos mensuales de la persona en pesos*/
    private int ingresosMensuales;
    
    /** Generacion del grupo de ICC*/

    final int GENERACION_ICC=20211;

    /**Cantidad de recuerdos que tiene cada persona*/
    public int cantidadDeRecuerdos=0;

    /** Generacion de ICC a la que pertenecen*/
    public int generacion;
    
    //Actividad 3*********************

    /** Lo que la persona más adora de su mascota*/
    public String adorable;

    /** Los recuerdos de la persona*/
    public String recuerdos;
    
    //ACTIVIDAD 2*********************************
    
    //Métodos constructores
    /**
     *Crea una persona
     *@param nombre de la persona 
     *@param edad de la persona
     *@param estatura de la persona en cm
     *@param verificador para saber si la persona usa lentes
     *@param color del cabello de la persona
    // *@param ingresos mensuales de la persona en pesos
    // *@param generacion del grupo de ICC a la que pertenece
     *@param lo que la persona más adora de su mascota
    // *@param sus recuerdos. comienza sin tener recuerdos.
    // *@param nombre de la mascota
     */

    public Persona(String nombre, int edad, int estatura, boolean lentes, String cabello, String adorable){
	this.nombre=nombre;
	this.edad=edad;
	this.estatura=estatura;
	this.usaLentes=lentes;
	this.colorCabello=cabello;
	this.ingresosMensuales=0;
	this.generacion=GENERACION_ICC;
	this.adorable=adorable;
	this.recuerdos=" ";
	this.cantidadDeRecuerdos=0;
	this.mascota="";
	contador++;
				    
    }

    /**
     *Crea una persona
     *@param nombre de la persona
     *@param verificador para saber si la persona usa lentes
     *@param color del cabello de la persona
     */

    public Persona(String nombre, boolean lentes, String cabello, int generacion, String adorable){
	this.nombre=nombre;
	this.edad=0;
	this.estatura=0;
	this.usaLentes=lentes;
	this.colorCabello=cabello;
	this.ingresosMensuales=0;
	this.generacion=GENERACION_ICC;
	this.adorable=adorable;
	this.recuerdos=" ";
	this.cantidadDeRecuerdos=0;
	this.mascota="";
	contador++;
    }

    /**
     *Crea una persona
     *@param edad de la persona
     *@param estatura de la persona en cm
     *@param verificador para saber si la persona usa lentes
     */

    public Persona(int edad, int estatura, boolean lentes, String adorable){
	this.nombre="Desconocido";
	this.edad=edad;
	this.estatura=estatura;
	this.usaLentes=lentes;
	this.colorCabello="Desconocido";
	this.ingresosMensuales=0;
	this.generacion=GENERACION_ICC;
	this.adorable=adorable;
	this.recuerdos=" ";
	this.cantidadDeRecuerdos=0;
	this.mascota="";
	contador++;
    }

     /**
     *Crea una persona
     *@param edad de la persona
     *@param estatura de la persona en cm
     *@param verificador para saber si la persona usa lentes
     */

    public Persona(String nombre){
	this.nombre=nombre;
	this.edad=0;
	this.estatura=0;
	this.usaLentes=false;
	this.colorCabello="Desconocido";
	this.ingresosMensuales=0;
        this.generacion=GENERACION_ICC;
	this.adorable="";
	this.recuerdos=" ";
	this.cantidadDeRecuerdos=0;
	this.mascota="";
    }


    
    //Métodos de acceso

    /**
     *Regresa el nombre de la persona
     *@return el nombre de la persona 
     */
    public String getNombre(){
	return nombre;
    }

    /**
     *Regresa la edad de la persona
     *@return la edad de la persona 
     */
    public int getEdad(){
	return edad;
    }
    
    /**
     *Regresa la estatura de la persona en centimetros
     *@return la estatura de la persona en centímetros
     */
    public int getEstatura(){
	return estatura;
    }

    /**
     *Regresa el verificador de si la persona usa lentes
     *@return el verificador de si la persona usa lentes
     */
    public boolean getLentes(){
	return usaLentes;
    }

     /**
     *Regresa el color del cabello de la persona
     *@return el color del cabello de la persona
     */
    public String getColorCabello(){
	return colorCabello;
    }

     /**
     *Regresa los ingresos mensuales de la persona en pesos
     *@return los ingresos mensuales de la persona en pesos
     */
    public int getIngresos(){
	return ingresosMensuales;
    }
    
     /**
     *Regresa lo que la persona más adora de su mascota
     *@return lo que la persona más adora de su mascota
     */
    public String getAdorable(){
	return adorable;
    }
    
     /**
     *Regresa los recuerdos de la persona
     *@return los recuerdos de la persona
     */
    public String getRecuerdos(){
	return recuerdos;
    }

    /**
     *Regresa la generacion del curso de ICC
     *@return generacion del curso de ICC
     */
    public int getGeneracion(){
	return GENERACION_ICC;
    }

    /**
     *Regresa la canidad de recuerdos que posee la persona
     *@return cantidad de recuerdos que posee la persona
     */

    public int getCantidadDeRecuerdos(){
	return cantidadDeRecuerdos;
    }

    //toString
    /**
     *toString que regresa de una persona su nombre, recuerdos y lo que más adora de su mascota
     *@return  regresa de una persona su nombre, recuerdos y lo que más adora de su mascota
     */
    public String toString(){
	return "Nombre: "+this.nombre+"\nLo que mas adora de su mascota: "+this.adorable+"\nSus recuerdos son: \n "+this.recuerdos+" \n";
    }
    
    //Contador de la Actividad 4
     /**
     *Regresa la cantidad de instancias que se han creado con la clase Persona
     *@return la cantidad de instancias que se han creado con la clase Persona
     */
    public static int getContador(){
	return contador;
    }

    //Actividad 5
    /**
     *regresa el nombre de la mascota de la persona
     *@return nombre de la mascota de la persona
     */

    public String getMascota(){
	return mascota;
    }
    
    
    //Metodos mutantes

    /**
     *Modifica el nombre de la persona 
     *@param nuevo nombre de la persona
     */
    public void setNombre(String nombre){
	this.nombre=nombre;
    }
    /**
     *Modifica la edad de la persona
     *@param nueva edad de la persona
     */
    public void setEdad(int edad){
	this.edad=edad;
    }

     /**
     *Modifica la estatura de la persona 
     *@param nueva estatura de la persona
     */
    public void setEstatura(int estatura){
	this.estatura=estatura;
    }

     /**
     *Modifica el verificador de si la persona usa lentes
     *@param nuevo estado del uso de lentes
     */
    public void setLentes(boolean lentes){
	this.usaLentes=lentes;
    }

     /**
     *Modifica el color del cabello de la persona 
     *@param nuevo color de cabello de la persona
     */
    public void setColorCabello(String cabello){
	this.colorCabello=cabello;
    }

     /**
     *Modifica los ingresos mensuales en pesos de la persona
     *@param nueva cantidad de ingresos mensuales de la persona
     */
    public void setIngresos(int ingresos){
	this.ingresosMensuales=ingresos;
    }
    
    /**
     *Modifica lo que la persona más adora de su mascota
     *@param lo que la persona más adora de su mascota
     */
    public void setAdorable(String adorable){
	this.adorable=adorable;
    }

    /**
     *Modifica la cantidad de recuerdos de la persona aumentando un recuerdo
     *@param recuerdos de la persona
     */

    public void setCantidadDeRecuerdos(){
	this.cantidadDeRecuerdos+=1; 
    }

    /**
     *Modifica los recuerdos de la persona
     *@param nuevo recuerdo de la persona 
     */
    public void setRecuerdos(Persona Persona, String nombre, String adorable){
	int cantidad;
	cantidad=Persona.getCantidadDeRecuerdos();
	
	if(cantidad<3){ //solo si la persona tiene menos de tres recuerdos puede almacenar uno nuevo
	    this.recuerdos=this.recuerdos+(cantidad+1)+"."+nombre+" me dijo que lo que mas adora de su mascota es/son: "+adorable+".\n";
	Persona.setCantidadDeRecuerdos();
	}

	else //en caso de que tenga ya sus tres recuerdos no se almacena ninguno nuevo y sus recuerdos quedan intactos
	    this.recuerdos=this.recuerdos;
    }

    //Contador de la Actividad 4
    /**
     *Modifica la el contador que lleva la catidad de instancias que se han generado con la clase Persona
     *@param modifica el contador que lleva la cantidad de instancias que se han generado con la clase Persona
     */
    public void setContador(int contador){
	this.contador=contador;
    }
    
    /**
     *Modifica el nombre de la mascota de la persona
     *@param modifica el nombre de la mascota de la persona
     */

    public void setMascota(String mascota){
	this.mascota=mascota;
    }

    public static void main(String[] args){
	//Actividad 3
	//Creación de las personas
	Persona p1= new Persona ("Aaron", 20, 184, false, "Negro", "sus ojos");
	Persona p2= new Persona ("Javier", 16, 176, false, "Negro",  "sus orejas");
	Persona p3= new Persona ("Jorge", 45, 170, true, "Negro", "el color de su cabello");
	Persona p4= new Persona ("Joy", 19, 165, true, "Negro", "lo apegadas que son la una con la otra");
	Persona p5= new Persona ("Comandante Espinacas", 50, 180, false, "Negro", "su leatad y compañerismo");
	Persona p6= new Persona ("Yisus", 20, 180, true, "Negro", "el curioso parecido entre ambos");
	
	//Las personas comienzan a contarse lo que más adoran de sus mascotas
	//Y, a su vez, comienzan a generar recuerdos
	p1.setRecuerdos(p1, p3.getNombre(), p3.getAdorable());
	p1.setRecuerdos(p1, p4.getNombre(), p4.getAdorable());
	p1.setRecuerdos(p1, p6.getNombre(), p6.getAdorable());
	
	p2.setRecuerdos(p2,p3.getNombre(), p3.getAdorable());
	p2.setRecuerdos(p2,p5.getNombre(), p5.getAdorable());
	p2.setRecuerdos(p2,p1.getNombre(), p1.getAdorable());
	
	p3.setRecuerdos(p3, p4.getNombre(), p4.getAdorable());
	p3.setRecuerdos(p3, p5.getNombre(), p5.getAdorable());
	p3.setRecuerdos(p3, p6.getNombre(), p6.getAdorable());

	p4.setRecuerdos(p4, p1.getNombre(), p1.getAdorable());
	p4.setRecuerdos(p4, p2.getNombre(), p2.getAdorable());
	p4.setRecuerdos(p4, p6.getNombre(), p6.getAdorable());

	p5.setRecuerdos(p5, p2.getNombre(), p2.getAdorable());
	p5.setRecuerdos(p5, p3.getNombre(), p3.getAdorable());
	p5.setRecuerdos(p5, p1.getNombre(), p1.getAdorable());

	p6.setRecuerdos(p6, p1.getNombre(), p1.getAdorable());
	p6.setRecuerdos(p6, p4.getNombre(), p4.getAdorable());
	p6.setRecuerdos(p6, p3.getNombre(), p3.getAdorable());

	//Impresión del nombre de las personas, lo que más adoran de sus mascotas y sus recuerdos
       	System.out.println(p1);
	System.out.println(p2);	
	System.out.println(p3);
	System.out.println(p4);
	System.out.println(p5);
	System.out.println(p6);

	//Todas las personas tienen el mismo valor en esa variable, ya que es es un atributo estática
	System.out.println("Cantidad de instacias creadas con la clase persona: "+ contador);
  
}   
}
    
