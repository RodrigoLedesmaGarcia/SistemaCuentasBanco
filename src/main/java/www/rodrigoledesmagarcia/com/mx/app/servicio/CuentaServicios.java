package www.rodrigoledesmagarcia.com.mx.app.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.rodrigoledesmagarcia.com.mx.app.modelo.Cuenta;
import www.rodrigoledesmagarcia.com.mx.app.repositorio.CuentaRepositorio;

import java.util.List;

@Service
public class CuentaServicios implements ICuentaServicio{

    @Autowired
    private CuentaRepositorio cuentaRepositorio;

    @Override
    public List<Cuenta> listarCuentas() {
        return cuentaRepositorio.findAll();
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta) {
        Cuenta cuenta = cuentaRepositorio.findById(idCuenta).orElse(null);
        return cuenta;
    }

    @Override
    public void guardarCuenta(Cuenta cuenta) {
        cuentaRepositorio.save(cuenta);
    }

    @Override
    public void eliminarCuenta(Cuenta cuenta) {
        cuentaRepositorio.delete(cuenta);
    }
}
