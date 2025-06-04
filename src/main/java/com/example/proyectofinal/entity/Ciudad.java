package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Ciudad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Ciudad extends Base{
    @Column(name = "nombreCiudad")
    private String nombreCiudad;
}
