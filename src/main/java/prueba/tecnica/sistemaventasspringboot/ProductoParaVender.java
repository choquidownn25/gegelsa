package prueba.tecnica.sistemaventasspringboot;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ProductoParaVender extends Producto {
    private Float cantidad;
    public void aumentarCantidad() {
        this.cantidad++;
    }
    public Float getTotal() {
        return this.getPrecio() * this.cantidad;
    }
}
