package br.tiagobarboza.screenmatchV1.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(
                         @JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("imdbVotes") String votos ) {
}
