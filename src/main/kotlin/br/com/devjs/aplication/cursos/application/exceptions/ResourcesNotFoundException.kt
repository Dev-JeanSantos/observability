package br.com.devjs.aplication.cursos.application.exceptions

data class ResourcesNotFoundException(
    val mensagem: String
) : RuntimeException()