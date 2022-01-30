package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService {

    fun listar(): List<Topico> {
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis no kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            )
        )
        return Arrays.asList(topico, topico, topico)
    }
}