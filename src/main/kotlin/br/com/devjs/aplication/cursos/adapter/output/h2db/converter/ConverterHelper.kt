package br.com.devjs.aplication.cursos.adapter.output.h2db.converter

import br.com.devjs.aplication.cursos.adapter.output.h2db.models.CourseModel
import br.com.devjs.aplication.cursos.application.domains.Course

fun Course.toEntity() = CourseModel(
        id = this.id,
        registrationNumber = this.registrationNumber,
        courseNumber = this.courseNumber,
        courseName = this.courseName,
        courseCategory = this.courseCategory,
        requisite = this.requisite,
        teacherName = this.teacherName,
        coursePeriod = this.coursePeriod
)

fun CourseModel.toDomain() = Course(
        id = this.toCourse().id,
        registrationNumber = this.toCourse().registrationNumber,
        courseNumber = this.toCourse().courseNumber,
        courseName = this.toCourse().courseName,
        courseCategory = this.toCourse().courseCategory,
        requisite = this.toCourse().requisite,
        teacherName = this.toCourse().teacherName,
        coursePeriod = this.toCourse().coursePeriod
)