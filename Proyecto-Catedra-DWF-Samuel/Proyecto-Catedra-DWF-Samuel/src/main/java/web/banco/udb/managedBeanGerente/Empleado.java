package web.banco.udb.managedBeanGerente;

public class Empleado {
    private String nombres;
    private String apellidos;
    private String cargo;
    private double salario;
    private String dui;

    public Empleado(String nombres, String apellidos, String cargo, double salario, String dui) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.salario = salario;
        this.dui = dui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
}

