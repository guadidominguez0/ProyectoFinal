package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "Aerolinea")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Aerolinea extends Base{
    @Column(name = "nombreAerolinea")
    private String nombreAerolinea;
}
