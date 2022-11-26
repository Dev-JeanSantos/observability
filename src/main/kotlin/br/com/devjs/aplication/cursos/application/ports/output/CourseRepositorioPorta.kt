package br.com.devjs.aplication.cursos.application.ports.output

import br.com.devjs.aplication.cursos.application.domains.Course


interface CourseRepositorioPorta {

    fun saveCourse(course: Course): Course
}