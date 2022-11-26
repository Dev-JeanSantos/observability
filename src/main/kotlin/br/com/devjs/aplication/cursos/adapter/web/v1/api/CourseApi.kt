package br.com.devjs.aplication.cursos.adapter.web.v1.api

import br.com.devjs.aplication.cursos.adapter.web.v1.requests.CourseRequest
import br.com.devjs.aplication.cursos.adapter.web.v1.response.CourseResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RequestMapping("v1/courses", produces = [MediaType.APPLICATION_JSON_VALUE])
@Validated
interface CourseApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveCourses(@RequestBody @Valid courseRequest: CourseRequest): CourseResponse

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllCourses():List<CourseResponse>

}
