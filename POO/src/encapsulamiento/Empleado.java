package encapsulamiento;

public class Empleado {
    private String nombre;
    private int documento;
    private char genero;
    private byte edad;
    private int horasT;
    static int vrHora;
    
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
    
    public String getNombre(){
      return nombre;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    
    
    public String listar(){
        String out="Info empleado:\n"
               + "Nombre: "+nombre +"\n"
               + "Documento: "+documento+"\n"
               + "Genero: "+(genero=='H'?"Hombre":"Mujer")+"\n"
               + "Edad: "+edad+"\n"
               + "VR Hora: "+vrHora+"\n"
               + "HorasT: "+horasT;
        return out;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }
}
