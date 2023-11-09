package www.rodrigoledesmagarcia.com.mx.app.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import www.rodrigoledesmagarcia.com.mx.app.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {
}
