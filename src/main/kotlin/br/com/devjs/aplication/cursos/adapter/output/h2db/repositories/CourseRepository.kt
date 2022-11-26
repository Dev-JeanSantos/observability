package br.com.devjs.aplication.cursos.adapter.output.h2db.repositories

import br.com.devjs.aplication.cursos.adapter.output.h2db.models.CourseModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository : JpaRepository<CourseModel, Long>