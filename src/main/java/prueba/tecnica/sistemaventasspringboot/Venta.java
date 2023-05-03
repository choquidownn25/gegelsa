package prueba.tecnica.sistemaventasspringboot;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Data
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fechaYHora;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private Set<ProductoVendido> productos;

    public Venta() {
        this.fechaYHora = Utiles.obtenerFechaYHoraActual();
    }


}
