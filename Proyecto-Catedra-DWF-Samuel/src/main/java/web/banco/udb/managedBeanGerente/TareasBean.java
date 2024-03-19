package web.banco.udb.managedBeanGerente;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@SessionScoped
public class TareasBean {

    private String tarea;
    private Date fechaEntrega;
    private String cajeroSeleccionado;
    private List<TareaAsignada> tareasAsignadas;

    public TareasBean() {
        tareasAsignadas = new ArrayList<>();
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCajeroSeleccionado() {
        return cajeroSeleccionado;
    }

    public void setCajeroSeleccionado(String cajeroSeleccionado) {
        this.cajeroSeleccionado = cajeroSeleccionado;
    }

    public List<TareaAsignada> getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void asignarTarea() {
        TareaAsignada tareaAsignada = new TareaAsignada(tarea, fechaEntrega, cajeroSeleccionado);
        tareasAsignadas.add(tareaAsignada);
        System.out.println("Tarea asignada: " + tareaAsignada);
        tarea = null;
        fechaEntrega = null;
        cajeroSeleccionado = null;
    }

    public static class TareaAsignada {
        private String tarea;
        private Date fechaEntrega;
        private String cajeroAsignado;

        public TareaAsignada(String tarea, Date fechaEntrega, String cajeroAsignado) {
            this.tarea = tarea;
            this.fechaEntrega = fechaEntrega;
            this.cajeroAsignado = cajeroAsignado;
        }

        public String getTarea() {
            return tarea;
        }

        public void setTarea(String tarea) {
            this.tarea = tarea;
        }

        public Date getFechaEntrega() {
            return fechaEntrega;
        }

        public void setFechaEntrega(Date fechaEntrega) {
            this.fechaEntrega = fechaEntrega;
        }

        public String getCajeroAsignado() {
            return cajeroAsignado;
        }

        public void setCajeroAsignado(String cajeroAsignado) {
            this.cajeroAsignado = cajeroAsignado;
        }

        @Override
        public String toString() {
            return "Tarea: " + tarea + ", Fecha de entrega: " + fechaEntrega + ", Cajero asignado: " + cajeroAsignado;
        }
    }
}


