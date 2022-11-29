package br.com.devjs.aplication.cursos.adapter.input.web.v1.controllers

import br.com.devjs.aplication.cursos.adapter.input.web.infrastructure.metrics.CustomerMetrics
import br.com.devjs.aplication.cursos.adapter.input.web.v1.api.CourseApi
import br.com.devjs.aplication.cursos.adapter.input.web.v1.converter.toDomain
import br.com.devjs.aplication.cursos.adapter.input.web.v1.converter.toListResponse
import br.com.devjs.aplication.cursos.adapter.input.web.v1.converter.toResponse
import br.com.devjs.aplication.cursos.adapter.input.web.v1.requests.CourseRequest
import br.com.devjs.aplication.cursos.adapter.input.web.v1.response.CourseResponse
import br.com.devjs.aplication.cursos.application.exceptions.ResourcesNotFoundException
import br.com.devjs.aplication.cursos.application.ports.input.CourseUseCase
import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController

@RestController
class CursoController(
    @Autowired
    private val courseUseCase: CourseUseCase,
    @Autowired
    private val customerMetrics: CustomerMetrics
) : CourseApi {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun saveCourses(courseRequest: CourseRequest): CourseResponse {
        try {
            logger.info("[CourseController][save] - Iniciando salvamento de um novo Curso: ${courseRequest.courseName}")
            val courseSaved = courseUseCase.saveCourse(courseRequest.toDomain())
            return courseSaved.toResponse().also {
                customerMetrics.countRegisterCourse()
                logger.info("[CourseController][save] - Finalizando salvamento de um no Curso: ${courseRequest.courseName}")
            }
        } catch (e: Exception) {
            throw ResourcesNotFoundException(e.message).also {
                logger.error("Os campos não devem ser nulos!")
            }
        }
    }

    override fun getAllCourses(): List<CourseResponse> {
        try {
            logger.info("[CourseController][getALLCourse] - Iniciando busca por todos os Cursos")
            return courseUseCase.getAllCourses().toListResponse().also {
                logger.info("[CourseController][getALLCourse] - Finalizando a busca por todos os Cursos")
            }
        } catch (e: Exception) {
            throw ResourcesNotFoundException("Gerou alguma falha").also {
                logger.error("Gerou alguma falha")
            }
        }
    }
}