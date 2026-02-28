package dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.apache.logging.log4j.message.Message;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProdutoRequest(
        @NotBlank(message = "O nome é obrigatório")
        @Size(min = 3, max = 150, message = "O nome deve ter entre 2 e 150 caracteres")
        String nome,
        @NotNull(message = "O preço é obrigatório")
        @DecimalMin(value = "0.99" ,message = "O valor mínimo é 0.99")
        BigDecimal preco,
        LocalDate expiracao
) {
}
