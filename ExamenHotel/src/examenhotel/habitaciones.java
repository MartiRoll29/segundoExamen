/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenhotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class habitaciones {
    
    
    private int num;
    private String estado;
    private double precio;
    private String tipo;
    int habita [][] = new int [3][3];

    public void mostrar(){
            StringBuilder sb = new StringBuilder();

        for (int i = 0; i < habita.length; i++) {
            habita[i][0]=i+501;
            //String Guardar = "Habitacion: "+habita[i][0]+"Precio: "+precio2+"Estado"+"";
            sb.append("Piso#"+1+"\n");
            sb.append("Habitacion: "+habita[i][0] +"\n");
            sb.append("Habitacion: "+habita[i][0] +"\n");
            sb.append("Habitacion: "+habita[i][0] +"\n");

        }
        JOptionPane.showMessageDialog(null, sb);
    
    }

    public void agregarDatos(int piso){
        int precio1 = 50;
        int precio2 = 60;
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < habita.length; i++) {
            habita[i][0]=i+501;
            habita[i][1]=i+501;
            habita[i][2]=i+501;
            habita[i][3]=i+501;


        }
        JOptionPane.showMessageDialog(null, sb);

        
    
        
//                // Mostrar la matriz
//        for (int i = 0; i < habita.length; i++) {
//            for (int j = 0; j < habita[i].length; j++) {
//                System.out.print(habita[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
    
    
    public void editar() {
        JOptionPane.showMessageDialog(null, "");

    }    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public habitaciones(int num, String estado, double precio, String tipo) {
        this.num = num;
        this.estado = estado;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "habitaciones{" + "num=" + num + ", estado=" + estado + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
    
}
