package br.com.eduardosilva.infrastructure.unidade.models;

import br.com.eduardosilva.application.unidade.UpdateUnidadeUseCase;

public record UpdateUnidadeResponse(Long videoId) {

    public UpdateUnidadeResponse(UpdateUnidadeUseCase.Output out) {
        this(out.unidadeId().value());
    }
}
