package br.com.devjs.aplication.cursos.application.ports.input

import br.com.devjs.aplication.cursos.application.domains.Course

interface CourseUseCase {
    fun saveCourse(course: Course): Course
}