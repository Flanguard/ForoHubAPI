package com.foro.ForoHubAPI.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name="topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String autor;
    private String mensaje;
    private String curso;
    private String titulo;
    @Enumerated(EnumType.STRING)
    private Estado status;
    private LocalDateTime fechaCreacion;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.autor = datosRegistroTopico.autor();
        this.mensaje = datosRegistroTopico.mensaje();
        this.curso = datosRegistroTopico.nombreCurso();
        this.titulo = datosRegistroTopico.titulo();
        this.status = datosRegistroTopico.status();
        this.fechaCreacion = LocalDateTime.now();
    }

    public void actualizarTopico(DatosActualizarTopico actualizarTopico) {
        this.autor = actualizarTopico.autor();
        this.mensaje = actualizarTopico.mensaje();
        this.curso = actualizarTopico.nombreCurso();
        this.titulo = actualizarTopico.titulo();
        this.status = actualizarTopico.estatus();
        this.fechaCreacion = LocalDateTime.now();
    }
}
