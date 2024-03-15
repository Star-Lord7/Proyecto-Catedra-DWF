package web.banco.udb.managedBeanGerente;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class AgregarEmpleadoBean {
    private String nombres;
    private String apellidos;
    private String dui;
    private String cargo;
    private double salario;
    private List<Empleado> empleados;

    public AgregarEmpleadoBean() {
        empleados = new ArrayList<>();
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

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
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

    public void registrarEmpleado() {
        Empleado empleado = new Empleado(nombres, apellidos, cargo, salario, dui);
        empleados.add(empleado);
        limpiarCampos();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    private void limpiarCampos() {
        nombres = "";
        apellidos = "";
        dui = "";
        cargo = "";
        salario = 0.0;
    }
}

