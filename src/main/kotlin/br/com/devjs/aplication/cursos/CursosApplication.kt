package br.com.devjs.aplication.cursos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(
        "br.com.devjs.aplication.cursos.*",
        "br.com.devjs.aplication.cursos.adapter.output.h2db.*"
)
@ComponentScan(
        basePackages = [
            "br.com.devjs.aplication.cursos.*",
            "br.com.devjs.aplication.cursos.adapter.output.h2db.*",
        ]
)
@EntityScan(
        "br.com.devjs.aplication.cursos.*",
        "br.com.devjs.aplication.cursos.adapter.output.h2db.*"
)
class CursosApplication

fun main(args: Array<String>) {
    runApplication<CursosApplication>(*args)
}
