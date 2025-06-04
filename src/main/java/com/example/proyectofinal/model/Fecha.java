package com.example.proyectofinal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.Date;

@Entity
@Table(name = "Fecha")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Fecha extends Base{
    @Temporal(TemporalType.DATE)
    private Date fecha;
}
