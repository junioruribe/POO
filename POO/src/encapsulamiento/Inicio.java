package encapsulamiento;

import ejercicios.*;
import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
       Empleado obj1;
       int doc;
       String nom;
       obj1=new Empleado();
       Empleado.vrHora=5000;
       nom=JOptionPane.showInputDialog("Ingrese nombre");
       obj1.setNombre(nom);
       doc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento"));
       obj1.setDocumento(doc);
       JOptionPane.showMessageDialog(null, "Nombre: "+obj1.getNombre()+ " Doc: "+obj1.getDocumento() +" Vr Hora: "+Empleado.vrHora);
       
       Empleado obj2=new Empleado("Paulina", 5010);
       JOptionPane.showMessageDialog(null, "Nombre: "+obj2.getNombre()+ " Doc: "+obj2.getDocumento());
       //JOptionPane.showMessageDialog(null,obj2.listar() );
       
       Empleado obj3=new Empleado("Felipe", 1080, 'H', (byte)23);
       obj3.setHorasT(81);
       JOptionPane.showMessageDialog(null, obj3.listar());
       
    }
    
}
