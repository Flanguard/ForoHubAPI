package com.foro.ForoHubAPI.domain.topico;

public record DatosRespuestaTopico(
        Long id,
        String autor,
        String mensaje,
        String curso,
        String titulo,
        String estado,
        String fechaCreacion
) {
    public DatosRespuestaTopico(Topico topico) {
        this(topico.getId(), topico.getAutor(), topico.getMensaje(),
                topico.getCurso(), topico.getTitulo(), topico.getStatus().toString(),
                topico.getFechaCreacion().toString());
    }
}
