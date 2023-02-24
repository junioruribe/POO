package ejercicios;

public class Empleado {
    String nombre;
    int documento;
    char genero;
    byte edad;
    int horasT;
    
    public Empleado(){
    }
    public Empleado(String nombre,int documento){
        this.nombre=nombre;
        this.documento=documento;
    }

    public Empleado(String nombre, int documento, char genero, byte edad, int horasT) {
        this.nombre = nombre;
        this.documento = documento;
        this.genero = genero;
        this.edad = edad;
        this.horasT = horasT;
    }

    public Empleado(String nombre, int documento, char genero, byte edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.genero = genero;
        this.edad = edad;
        horasT=10;
    }
    
    public String listar(){
        String out="Info empleado:\n"
               + "Nombre: "+nombre +"\n"
               + "Documento: "+documento+"\n"
               + "Genero: "+(genero=='H'?"Hombre":"Mujer")+"\n"
               + "Edad: "+edad+"\n"
               + "HorasT: "+horasT;
        return out;
    }
}
