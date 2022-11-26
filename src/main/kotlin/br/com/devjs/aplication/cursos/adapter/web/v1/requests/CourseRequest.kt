package br.com.devjs.aplication.cursos.adapter.web.v1.requests

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank
import java.time.LocalDateTime

data class CourseRequest(

    val id: Long? = null,

    @JsonProperty("registration_number")
    @field:NotBlank
    val registrationNumber: String,

    @field:NotBlank
    @JsonProperty("course_number")
    val courseNumber: String,

    @field:NotBlank
    @JsonProperty("course_name")
    val courseName: String,

    @field:NotBlank
    @JsonProperty("course_category")
    val courseCategory: String,

    @field:NotBlank
    @JsonProperty("requisite")
    val requisite: String,

    @field:NotBlank
    @JsonProperty("teacher_name")
    val teacherName: String,

    @field:NotBlank
    @JsonProperty("course_period")
    val coursePeriod: String,

    val registrationDate: LocalDateTime? = null,
)
