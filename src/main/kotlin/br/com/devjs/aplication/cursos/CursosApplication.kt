package br.com.devjs.aplication.cursos

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CursosApplication

val logger = LoggerFactory.getLogger(CursosApplication::class.java)
fun main(args: Array<String>) {
    logger.info("Subindo a Aplicação")
    runApplication<CursosApplication>(*args)
    logger.info("API Criar Cursos")
}