package web.banco.udb.managedbean;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Login {
    private String usuario;
    private String password;

    public Login() {
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {this.password = password;
    }
}
