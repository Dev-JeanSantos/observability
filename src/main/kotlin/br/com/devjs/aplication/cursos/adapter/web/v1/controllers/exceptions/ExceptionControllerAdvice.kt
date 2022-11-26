package br.com.devjs.aplication.cursos.adapter.web.v1.controllers.exceptions

import br.com.devjs.aplication.cursos.application.exceptions.ResourcesNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionControllerAdvice {

    @ExceptionHandler
    fun handleIllegalStateException(ex: ResourcesNotFoundException): ResponseEntity<ResourcesNotFoundException> {
        return ResponseEntity(ResourcesNotFoundException(ex.mensagem), HttpStatus.BAD_REQUEST)
    }
}