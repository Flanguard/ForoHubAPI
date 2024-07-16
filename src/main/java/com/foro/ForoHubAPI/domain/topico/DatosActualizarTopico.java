package com.foro.ForoHubAPI.domain.topico;

public record DatosActualizarTopico(
    String autor,
    String mensaje,
    String nombreCurso,
    String titulo,
    Estado estatus

) {
}
