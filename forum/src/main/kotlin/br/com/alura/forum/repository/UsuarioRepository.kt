package br.com.alura.forum.repository

import br.com.alura.forum.model.Usuario
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository: JpaRepository<Usuario, Long> {
    @Bean
    fun findByEmail(username: String?): Usuario?
}