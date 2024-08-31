package br.com.fiap.ms_pedidos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // Indica que esta é uma classe de configuração do Spring
public class ConfigModelMapper {

    @Bean  // Registra o ModelMapper como um bean gerenciado pelo Spring
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
