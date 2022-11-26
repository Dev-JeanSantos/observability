package br.com.devjs.aplication.cursos.adapter.output.h2db.service

import br.com.devjs.aplication.cursos.adapter.output.h2db.converter.toDomain
import br.com.devjs.aplication.cursos.adapter.output.h2db.converter.toEntity
import br.com.devjs.aplication.cursos.adapter.output.h2db.repositories.CourseRepository
import br.com.devjs.aplication.cursos.application.domains.Course
import br.com.devjs.aplication.cursos.application.ports.output.CourseRepositorioPorta
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class CourseRepositoryService(
    private val repository: CourseRepository
) : CourseRepositorioPorta {

    private val logger = LoggerFactory.getLogger(javaClass)

    @Transactional
    override fun saveCourse(course: Course): Course {
        logger.info("[GameRepository][save] Iniciando salvamento course no H2. Codigo do Curso: ${course.registrationNumber}")
        return repository.save(course.toEntity()).toDomain().also {
            logger.info("[GameRepository][save] Finalizando salvamento course no H2. Codigo do Curso: ${course.registrationNumber}")
        }
    }
}