package br.com.devjs.aplication.cursos.adapter.input.web.infrastructure.metrics

import org.springframework.stereotype.Component

@Component
class CustomerMetrics(var sreMetrics: SreMetrics) {

    fun countRegisterCourse() = sreMetrics.measeureRegisterCourses(
            metricName = "registerCourses",
            value = 1.0,
            labels = arrayOf(
                    "Courses", "courses"
            )
    )

}