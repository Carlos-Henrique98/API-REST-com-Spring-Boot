package br.com.alura.forum.model.service

import br.com.alura.forum.mapper.TopicoFormMapper
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.model.TopicoTest
import br.com.alura.forum.repository.TopicoRepository
import br.com.alura.forum.service.TopicoService
import io.mockk.every
import io.mockk.mockk
import org.springframework.data.domain.PageImpl

class TopicoServiceTest {

    val topicos = PageImpl(listOf(TopicoTest.build()))

    val topicoRepository: TopicoRepository = mockk {
        every {
            findByCursoNome(any(), any())
        } returns topicos
    }
    val topicoViewMapper: TopicoViewMapper = mockk()
    val topicoFormMapper: TopicoFormMapper = mockk()

    val topicoService = TopicoService(
            topicoRepository, topicoViewMapper, topicoFormMapper
    )


}