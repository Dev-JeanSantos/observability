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
     val id: Long?,
     val registrationNumber: String,
     val courseNumber: String,
     val courseName: String,
     val courseCategory: String,
     val requisite: String,
     val teacherName: String,
     val coursePeriod: String,
     val registrationDate: LocalDateTime = LocalDateTime.now()
)