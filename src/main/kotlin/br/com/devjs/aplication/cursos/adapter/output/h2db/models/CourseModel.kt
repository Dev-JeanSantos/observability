package br.com.devjs.aplication.cursos.adapter.output.h2db.models

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "course")
data class CourseModel (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     val id: Long? = null,
     val registrationNumber: String = "",
     val courseNumber: String = "",
     val courseName: String = "",
     val courseCategory: String = "",
     val requisite: String = "",
     val teacherName: String = "",
     val coursePeriod: String = "",
     val registrationDate: LocalDateTime = LocalDateTime.now()
)