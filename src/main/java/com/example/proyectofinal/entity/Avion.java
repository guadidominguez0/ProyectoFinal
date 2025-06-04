package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Avion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Avion extends Base{
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinTable(
            name = "avion_asiento",
            joinColumns = @JoinColumn(name = "avion_id"),
            inverseJoinColumns = @JoinColumn(name = "asiento_id")
    )
    private List<Asiento> asientos = new ArrayList<Asiento>();
}
