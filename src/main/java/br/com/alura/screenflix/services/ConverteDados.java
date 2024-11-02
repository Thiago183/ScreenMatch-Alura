package br.com.alura.screenflix.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{


    ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterDados(String Json, Class<T> classe) {
        try {
            return mapper.readValue(Json,classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
