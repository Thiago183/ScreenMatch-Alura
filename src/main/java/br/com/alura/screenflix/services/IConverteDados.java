package br.com.alura.screenflix.services;

public interface IConverteDados {

    <T> T obterDados(String Json , Class<T> classe);
}
