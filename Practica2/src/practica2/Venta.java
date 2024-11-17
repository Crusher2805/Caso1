/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 *
 */
public class Venta {

    double monto;
    double impuesto;
    int total;

    public Venta() {
        this.monto = 0.0;
        this.total = 0;
        this.impuesto = 0.0;
        
    }

    public Venta(double monto, double impuesto, int total) {
        this.monto = monto;
        this.impuesto = impuesto;
        this.total = total;
    }
    
    

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public double calcularTotal() {
        return monto + impuesto;
    }

    @Override
    public String toString() {
        return "Monto " + monto + ", Total " + total + ", Impuesto " + impuesto;
    }
}
