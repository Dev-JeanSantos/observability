package br.com.devjs.aplication.cursos.adapter.output.h2db.models

import br.com.devjs.aplication.cursos.application.domains.Course
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class CourseModel (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long?,
    private val registrationNumber: String,
    private val courseNumber: String,
    private val courseName: String,
    private val courseCategory: String,
    private val requisite: String,
    private val teacherName: String,
    private val coursePeriod: String,
    private val registrationDate: LocalDateTime = LocalDateTime.now(),
)
{
    fun toCourse() = Course(
            id = this.id,
            registrationNumber = this.registrationNumber,
            courseNumber = this.courseNumber,
            teacherName = this.teacherName,
            coursePeriod = this.coursePeriod,
            courseCategory = this.courseCategory,
            courseName = this.courseName,
            requisite = this.requisite
    )
}