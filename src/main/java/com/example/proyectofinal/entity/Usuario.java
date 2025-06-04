package com.example.proyectofinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@DiscriminatorValue("Usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Usuario extends Persona{
    @Column(name = "numeroUsuario")
    private int numeroUsuario;

    @Column(name = "contaseniaUsuario")
    private String contaseniaUsuario;

    @Column(name = "correoElectronicoUsuario")
    private String correoElectronicoUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_reserva")
    private Reserva reserva;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_consulta",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "consulta_id")
    )
    private List<Consulta> consultas;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_tarjeta",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "tarjeta_id")
    )
    private List <Tarjeta> tarjetas;
}
