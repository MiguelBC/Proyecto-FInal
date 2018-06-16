package edu.progra2.loanMORENO.model;


import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

    public class Salary {


        private Integer dni;
        private String nombre;
        @Email
        private String correo;
        @NotNull
        @Min(3)
        private double sueldo;
        @NotNull
        @Min(3)
        private double uit;
        private double total_impuesto;
        private double total_bruto;
        private double total_neta;
        private int retencion_mensual;

        private double maximo_5;
        private double monto_afecto_5;
        private double impuesto_5;
        private double maximo_20;
        private double monto_afecto_20;
        private double impuesto_20;
        private double maximo_35;
        private double monto_afecto_35;
        private double impuesto_35;
        private double maximo_45;
        private double monto_afecto_45;
        private double impuesto_45;
        private String maximo_46;
        private double monto_afecto_46;
        private double impuesto_46;
        private double total_monto_afecto;
        private double descontable_uit;
        private double renta_grabable;
        private String tipo;
        public Integer getDni() {
            return dni;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public void setDni(Integer dni) {
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getSueldo() {
            return sueldo;
        }

        public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
        }

        public double getUit() {
            return uit;
        }

        public void setUit(double uit) {
            this.uit = uit;
        }

        public double getTotal_impuesto() {
            return total_impuesto;
        }

        public void setTotal_impuesto(double total_impuesto) {
            this.total_impuesto = total_impuesto;
        }

        public double getTotal_bruto() {
            return total_bruto;
        }

        public void setTotal_bruto(double total_bruto) {
            this.total_bruto = total_bruto;
        }

        public double getTotal_neta() {
            return total_neta;
        }

        public void setTotal_neta(double total_neta) {
            this.total_neta = total_neta;
        }

        public int getRetencion_mensual() {
            return retencion_mensual;
        }

        public void setRetencion_mensual(int retencion_mensual) {
            this.retencion_mensual = retencion_mensual;
        }

        public double getMaximo_5() {
            return maximo_5;
        }

        public void setMaximo_5(double maximo_5) {
            this.maximo_5 = maximo_5;
        }

        public double getMonto_afecto_5() {
            return monto_afecto_5;
        }

        public void setMonto_afecto_5(double monto_afecto_5) {
            this.monto_afecto_5 = monto_afecto_5;
        }

        public double getImpuesto_5() {
            return impuesto_5;
        }

        public void setImpuesto_5(double impuesto_5) {
            this.impuesto_5 = impuesto_5;
        }

        public double getMaximo_20() {
            return maximo_20;
        }

        public void setMaximo_20(double maximo_20) {
            this.maximo_20 = maximo_20;
        }

        public double getMonto_afecto_20() {
            return monto_afecto_20;
        }

        public void setMonto_afecto_20(double monto_afecto_20) {
            this.monto_afecto_20 = monto_afecto_20;
        }

        public double getImpuesto_20() {
            return impuesto_20;
        }

        public void setImpuesto_20(double impuesto_20) {
            this.impuesto_20 = impuesto_20;
        }

        public double getMaximo_35() {
            return maximo_35;
        }

        public void setMaximo_35(double maximo_35) {
            this.maximo_35 = maximo_35;
        }

        public double getMonto_afecto_35() {
            return monto_afecto_35;
        }

        public void setMonto_afecto_35(double monto_afecto_35) {
            this.monto_afecto_35 = monto_afecto_35;
        }

        public double getImpuesto_35() {
            return impuesto_35;
        }

        public void setImpuesto_35(double impuesto_35) {
            this.impuesto_35 = impuesto_35;
        }

        public double getMaximo_45() {
            return maximo_45;
        }

        public void setMaximo_45(double maximo_45) {
            this.maximo_45 = maximo_45;
        }

        public double getMonto_afecto_45() {
            return monto_afecto_45;
        }

        public void setMonto_afecto_45(double monto_afecto_45) {
            this.monto_afecto_45 = monto_afecto_45;
        }

        public double getImpuesto_45() {
            return impuesto_45;
        }

        public void setImpuesto_45(double impuesto_45) {
            this.impuesto_45 = impuesto_45;
        }

        public String getMaximo_46() {
            return maximo_46;
        }

        public void setMaximo_46(String maximo_46) {
            this.maximo_46 = maximo_46;
        }

        public double getMonto_afecto_46() {
            return monto_afecto_46;
        }

        public void setMonto_afecto_46(double monto_afecto_46) {
            this.monto_afecto_46 = monto_afecto_46;
        }

        public double getImpuesto_46() {
            return impuesto_46;
        }

        public void setImpuesto_46(double impuesto_46) {
            this.impuesto_46 = impuesto_46;
        }

        public double getTotal_monto_afecto() {
            return total_monto_afecto;
        }

        public void setTotal_monto_afecto(double total_monto_afecto) {
            this.total_monto_afecto = total_monto_afecto;
        }

        public double getDescontable_uit() {
            return descontable_uit;
        }

        public void setDescontable_uit(double descontable_uit) {
            this.descontable_uit = descontable_uit;
        }


        public double getRenta_grabable() {
            return renta_grabable;
        }

        public void setRenta_grabable(double renta_grabable) {
            this.renta_grabable = renta_grabable;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }
