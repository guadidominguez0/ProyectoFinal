package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@DiscriminatorValue("Tarjeta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarjeta extends Pago{
    @Column(name = "numeroTarjeta")
    private int numeroTarjeta;

    @Enumerated(EnumType.STRING)
    private TipoTarjeta tipoTarjeta;
}
