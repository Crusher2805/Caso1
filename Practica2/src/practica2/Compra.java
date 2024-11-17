/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 *
 */
public class Compra {

    private double monto;
    private boolean exento;
    private double impuesto;

    public Compra() {
        this.monto = 0.0;
        this.exento = false;
        this.impuesto = 0.0;
    }

    public Compra(double monto, boolean exento, double impuesto) {
        this.monto = monto;
        this.exento = exento;
        this.impuesto = impuesto;
    }

  
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isExento() {
        return exento;
    }

    public void setExento(boolean exento) {
        this.exento = exento;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Monto " + monto + ", Exento " + exento + ", Impuesto " + impuesto;
    }
}
