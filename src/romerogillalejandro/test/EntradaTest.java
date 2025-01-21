package romerogillalejandro.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import romerogillalejandro.Concierto;
import romerogillalejandro.Entrada;

class EntradaTest {

    @Test
    void testEntrada() {
        // Crear un concierto con todos los datos necesarios
        LocalDate fecha = LocalDate.parse("15/12/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalTime hora = LocalTime.parse("17:30", DateTimeFormatter.ofPattern("HH:mm"));
        String lugar = "Parque";
        int aforo = 100;
        double precioEntrada = 50.0;
        Concierto concierto = new Concierto("JavaFest", fecha, hora, lugar, aforo, precioEntrada);

        // Actualizar incrementos (opcional, si los valores predeterminados no se desean)
        concierto.setIncrementoVip(20.0);
        concierto.setIncrementoCamping(10.0);

        // Crear una entrada asociada al concierto
        String propietario = "Juan Pérez";
        boolean vip = true;
        boolean camping = true;
        Entrada entrada = new Entrada(concierto, propietario, vip, camping);

        // Calcular el precio esperado
        double precioEsperado = precioEntrada + concierto.getIncrementoVip() + concierto.getIncrementoCamping();

        assertNotNull(entrada);
        assertEquals(propietario, entrada.getPropietario());
        assertEquals(precioEsperado, entrada.getPrecio(), 0.001);
        assertEquals("JavaFest", concierto.getNombre());
    }
}