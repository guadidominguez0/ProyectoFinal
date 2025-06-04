package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Asiento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Asiento extends Base{
    @Column(name = "filaAsiento")
    private int filaAsiento;

    @Column(name = "letraAsiento")
    private char letraAsiento;

    @Enumerated(EnumType.STRING)
    private Clase claseAsiento;
}
