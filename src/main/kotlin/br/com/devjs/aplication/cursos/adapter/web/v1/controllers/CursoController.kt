package br.com.devjs.aplication.cursos.adapter.web.v1.controllers

import br.com.devjs.aplication.cursos.adapter.web.v1.api.CourseApi
import br.com.devjs.aplication.cursos.adapter.web.v1.converte.toDomain
import br.com.devjs.aplication.cursos.adapter.web.v1.converte.toResponse
import br.com.devjs.aplication.cursos.adapter.web.v1.requests.CourseRequest
import br.com.devjs.aplication.cursos.adapter.web.v1.response.CourseResponse
import br.com.devjs.aplication.cursos.application.ports.input.CourseUseCase
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CursoController(
    @Autowired
    private val courseUseCase: CourseUseCase
): CourseApi {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun saveCourses(@RequestBody courseRequest: CourseRequest): CourseResponse {
        logger.info("Iniciando salvamento de um novo Curso")
        val courseSaved = courseUseCase.saveCourse(courseRequest.toDomain())
        return courseSaved.toResponse().also {
            logger.info("Finalizando salvamento de um no Curso: ${courseRequest.courseName}")
        }
    }
}