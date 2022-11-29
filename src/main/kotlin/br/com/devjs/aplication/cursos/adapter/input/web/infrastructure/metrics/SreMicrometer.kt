package br.com.devjs.aplication.cursos.adapter.input.web.infrastructure.metrics

import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.Metrics
import org.springframework.stereotype.Component

@Component
object SreMicrometer : SreMetrics {

    override fun measeureRegisterCourses(metricName: String, value: Double, labels: Array<String>?) {
        Counter.builder(metricName)
            .also {
                if (labels != null){
                    it.tags(*labels)
                }
            }
            .register(Metrics.globalRegistry)
            .also {
                it.increment(value)
            }
    }
}