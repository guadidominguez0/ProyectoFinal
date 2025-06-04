package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_pago", discriminatorType = DiscriminatorType.STRING)
@Table(name = "Pago")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Pago extends Base{
    @Column(name = "cantidadPago")
    protected int cantidadPago;
}
