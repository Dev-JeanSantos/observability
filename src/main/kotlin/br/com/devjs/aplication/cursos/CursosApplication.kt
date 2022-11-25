package br.com.devjs.aplication.cursos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CursosApplication

fun main(args: Array<String>) {
	runApplication<CursosApplication>(*args)
}
