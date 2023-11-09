package www.rodrigoledesmagarcia.com.mx.app.servicio;

import www.rodrigoledesmagarcia.com.mx.app.modelo.Cuenta;

import java.util.List;

public interface ICuentaServicio {
    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer idCuenta);

    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);

}
