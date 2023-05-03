package prueba.tecnica.sistemaventasspringboot;

import lombok.*;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class ProductoVendido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Float cantidad, precio;
    private String nombre, codigo;
    @ManyToOne
    @JoinColumn
    private Venta venta;


}
