package br.com.devjs.aplication.cursos.adapter.input.web.v1.response

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class CourseResponse(
    @JsonProperty("Nome do Curso")
    val name: String,
    @JsonProperty("Categoria")
    val category: String,
    @JsonProperty("ID do Curso")
    val idCourse: String,
    @JsonProperty("Data de Criação")
    val dataCreater: LocalDateTime
)