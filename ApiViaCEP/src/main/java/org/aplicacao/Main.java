package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       ApiServico apiServico = new ApiServico();
       try{

           EnderecoDto enderecoDto = apiServico.getEndereco("12916330");
           System.out.println(enderecoDto.getLogradouro());

       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}