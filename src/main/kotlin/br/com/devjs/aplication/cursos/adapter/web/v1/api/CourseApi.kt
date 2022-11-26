package br.com.devjs.aplication.cursos.adapter.web.v1.api

import br.com.devjs.aplication.cursos.adapter.web.v1.requests.CourseRequest
import br.com.devjs.aplication.cursos.adapter.web.v1.response.CourseResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@RequestMapping("v1/courses", produces = [MediaType.APPLICATION_JSON_VALUE])
@Validated
interface CourseApi {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun saveCourses(@RequestBody @Valid courseRequest: CourseRequest): CourseResponse
}
