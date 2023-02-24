package ejercicios;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
       Empleado obj1;
       int doc;
       obj1=new Empleado();
       obj1.nombre=JOptionPane.showInputDialog("Ingrese nombre");
       doc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento"));
       obj1.documento=doc;
       JOptionPane.showMessageDialog(null, "Nombre: "+obj1.nombre+ " Doc: "+obj1.documento);
       
       Empleado obj2=new Empleado("Paulina", 5010);
       //JOptionPane.showMessageDialog(null, "Nombre: "+obj2.nombre+ " Doc: "+obj2.documento);
       JOptionPane.showMessageDialog(null,obj2.listar() );
       
       Empleado obj3=new Empleado("Felipe", 1080, 'H', (byte)23);
       obj3.horasT=81;
       JOptionPane.showMessageDialog(null, obj3.listar());
       
    }
    
}
