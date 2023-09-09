package supermarket.spring.api.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter @Setter @NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;
    private String nombre;
    @Column(name = "id_categoria")
    private String idCategoria;
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Column(name = "previo_venta")
    private Double precioVenta;
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;


}
