package br.com.devjs.aplication.cursos.adapter.web.v1.converter

import br.com.devjs.aplication.cursos.adapter.web.v1.requests.CourseRequest
import br.com.devjs.aplication.cursos.adapter.web.v1.response.CourseResponse
import br.com.devjs.aplication.cursos.application.domains.Course

fun CourseRequest.toDomain() = Course(
        id = this.id,
        registrationNumber = this.registrationNumber,
        courseNumber = this.courseNumber,
        courseName = this.courseName,
        courseCategory = this.courseCategory,
        requisite = this.requisite,
        teacherName = this.teacherName,
        coursePeriod = this.coursePeriod,
        registrationDate = this.registrationDate
)

fun Course.toResponse() = CourseResponse(
        name = this.courseName,
        category = this.courseCategory,
        idCourse = this.courseNumber,
        dataCreater = this.registrationDate!!
        )

fun List<Course>.toListResponse(): List<CourseResponse>{
        return this.map {
                it.toResponse()
        }
}