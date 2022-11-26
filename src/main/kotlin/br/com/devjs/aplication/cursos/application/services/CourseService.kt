package br.com.devjs.aplication.cursos.application.services

import br.com.devjs.aplication.cursos.application.domains.Course
import br.com.devjs.aplication.cursos.application.exceptions.ResourcesNotFoundException
import br.com.devjs.aplication.cursos.application.ports.input.CourseUseCase
import br.com.devjs.aplication.cursos.application.ports.output.CourseRepositorioPorta
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CourseService(
    @Autowired
    private val courseRepositorioPorta: CourseRepositorioPorta
) : CourseUseCase {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun saveCourse(course: Course): Course {
        try {
            logger.info("[CourseService][saveCourse] - Iniciando Salvamento do Curso. Numero do Curso: ${course.courseNumber}")
            return course.save(courseRepositorioPorta).also {
                logger.info("[CourseService][saveCourse] - Finalizando Salvamento do Curso. Numero do Curso: ${course.courseNumber}")
            }
        } catch (e: Exception) {
            logger.error(e.message)
            throw ResourcesNotFoundException("teste")
        }
    }

    override fun getAllCourses(): List<Course> {
        try {
            logger.info("[CourseService][getAllCourses] - Iniciando busca por todos os Cursos")
            return courseRepositorioPorta.getAllCourses().also {
                logger.info("[CourseService][getAllCourses] - Finalizando busca por todos os Cursos")
            }
        } catch (e: Exception) {
            logger.error(e.message)
            throw ResourcesNotFoundException("teste")
        }
    }
}