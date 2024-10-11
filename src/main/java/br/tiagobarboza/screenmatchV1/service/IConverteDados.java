package br.tiagobarboza.screenmatchV1.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
