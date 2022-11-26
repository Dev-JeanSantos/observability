package br.com.devjs.aplication.cursos.adapter.web.v1.api

import br.com.devjs.aplication.cursos.adapter.web.v1.requests.CourseRequest
import br.com.devjs.aplication.cursos.adapter.web.v1.response.CourseResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RequestMapping("v1/courses")
interface CourseApi {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    fun saveCourses(@RequestBody @Valid courseRequest: CourseRequest): CourseResponse
}
