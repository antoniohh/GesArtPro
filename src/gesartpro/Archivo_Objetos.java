/*
 * Clase Archivo_Objetos.
 */

package gesartpro;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo_Objetos {
    
    private File f;
    
    public boolean CrearArchivoProveedores() {        
        boolean b=false;    
        try{
            f=new File("proveedores.obj");
            if (f.exists())
            b=true;
        }        
        catch(Exception e){
            e.printStackTrace();
        }       
        return b;
    }
    
    public boolean CrearArchivoArticulos() {        
        boolean b=false;       
        try{
            f=new File("articulos.obj");
            if (f.exists())
            b=true;
        }   
        catch(Exception e){
            e.printStackTrace();
        }       
        return b;
    }
    
    public void EscribirArchivoProveedores(Proveedor prov) {   
        try{
            FileOutputStream fich=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fich);
            oos.writeObject(prov);
            oos.flush();
            oos.close();
            fich.close();
        }       
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void EscribirArchivoArticulos(Articulo art) {    
        try{
            FileOutputStream fich=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fich);
            oos.writeObject(art);
            oos.flush();
            oos.close();
            fich.close();
        }    
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void AñadirArchivoProveedores(Proveedor prov) {    
        try{
            FileOutputStream fich=new FileOutputStream(f,true);
            MiObjectOutputStream oos = new MiObjectOutputStream(fich);
            oos.writeObject(prov);
            oos.flush();
            oos.close();
            fich.close();
        }        
        catch(Exception ex) {
            ex.printStackTrace();
        }  
    }
    
    public void AñadirArchivoArticulos(Articulo art) {    
        try{
            FileOutputStream fich=new FileOutputStream(f,true);
            MiObjectOutputStream oos = new MiObjectOutputStream(fich);
            oos.writeObject(art);
            oos.flush();
            oos.close();
            fich.close();
        }        
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Articulo> LeerArchivoArticulos() {        
        ArrayList<Articulo>c=new ArrayList<Articulo>();    
        try{
            FileInputStream fich=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fich);
            Articulo cli=new Articulo();
            cli=(Articulo)ois.readObject();    
            while(cli!=null) {
                c.add(cli);
                cli=(Articulo)ois.readObject();
            }            
            ois.close();
            fich.close();
        }       
        catch (EOFException e1){
        // System.out.println ("Fin de fichero");
        }       
        catch (Exception e2){
            e2.printStackTrace();
        }        
        return c;
    }
    
    public ArrayList<Proveedor> LeerArchivoProveedores() {    
        ArrayList<Proveedor>c=new ArrayList<Proveedor>();    
        try{
            FileInputStream fich=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fich);
            Proveedor prov=new Proveedor();
            prov=(Proveedor)ois.readObject();        
            while(prov!=null) {
                c.add(prov);
                prov=(Proveedor)ois.readObject();
            }            
            ois.close();
            fich.close();
        }     
        catch (EOFException e1){
        // System.out.println ("Fin de fichero");
        }    
        catch (Exception e2){
            e2.printStackTrace();
        }        
        return c;
    }
    
    public void borrar_articulos(ArrayList<Articulo> c1) {
        try{
            FileOutputStream fich=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fich);    
            for (int i=0;i<c1.size();i++) {
                oos.writeObject(c1.get(i));
            }
            oos.flush();
            oos.close();
            fich.close();
        }    
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void borrar_proveedores(ArrayList<Proveedor> c2) {
        try{
            FileOutputStream fich=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fich);    
            for (int i=0;i<c2.size();i++) {
                oos.writeObject(c2.get(i));
            }
            oos.flush();
            oos.close();
            fich.close();
        }   
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}