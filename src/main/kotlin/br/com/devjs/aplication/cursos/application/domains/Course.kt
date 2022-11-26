package br.com.devjs.aplication.cursos.application.domains

import br.com.devjs.aplication.cursos.application.ports.output.CourseRepositorioPorta
import java.time.LocalDateTime

data class Course (
    val id: Long?,
    val registrationNumber: String,
    val courseNumber: String,
    val courseName: String,
    val courseCategory: String,
    val requisite: String,
    val teacherName: String,
    val coursePeriod: String,
    val registrationDate: LocalDateTime?,
){
    fun save(repositoryPort: CourseRepositorioPorta) = repositoryPort.saveCourse(this)
}
