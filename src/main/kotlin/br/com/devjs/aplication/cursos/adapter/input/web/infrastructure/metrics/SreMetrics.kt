package br.com.devjs.aplication.cursos.adapter.input.web.infrastructure.metrics

import org.springframework.stereotype.Component

@Component
interface SreMetrics {

    fun measeureRegisterCourses(
        metricName: String,
        value: Double = 1.0,
        labels: Array<String>? = null
    )
}