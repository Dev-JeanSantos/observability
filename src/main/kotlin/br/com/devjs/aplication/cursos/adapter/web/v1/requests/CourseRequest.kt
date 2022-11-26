package br.com.devjs.aplication.cursos.adapter.web.v1.requests

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime
import java.util.*

data class CourseRequest(
    val id: Long? = null,
    @JsonProperty("registration_number")
    val registrationNumber: String,
    @JsonProperty("course_number")
    val courseNumber: String,
    @JsonProperty("course_name")
    val courseName: String,
    @JsonProperty("course_category")
    val courseCategory: String,
    @JsonProperty("requisite")
    val requisite: String,
    @JsonProperty("teacher_name")
    val teacherName: String,
    @JsonProperty("course_period")
    val coursePeriod: String,
)
