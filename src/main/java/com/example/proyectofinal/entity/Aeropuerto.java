package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Aeropuerto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Aeropuerto extends Base{
    @Column(name = "nombreAeropuerto")
    private String nombreAeropuerto;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_ciudad")
    private Ciudad ciudad;
}
