package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@DiscriminatorValue("Piloto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Piloto extends Persona{
    @Column(name = "numeroPiloto")
    private int numeroPiloto;
}
