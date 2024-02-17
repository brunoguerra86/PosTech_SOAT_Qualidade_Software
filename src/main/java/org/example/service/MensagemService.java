
package org.example.service;

import java.util.UUID;
import org.example.model.Mensagem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Interface MensagemService.
 *
 * @author Bruno Guerra
 */
public interface MensagemService {

  Mensagem criarMensagem(Mensagem mensagem);

  Mensagem buscarMensagem(UUID id);

  Mensagem alterarMensagem(UUID id, Mensagem mensagemNova);

  boolean apagarMensagem(UUID id);

  Mensagem incrementarGostei(UUID id);

  Page<Mensagem> listarMensagens(Pageable pageable);
}
