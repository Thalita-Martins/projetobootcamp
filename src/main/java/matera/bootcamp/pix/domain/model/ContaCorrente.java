package matera.bootcamp.pix.domain.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long agencia;

    @Column(nullable = false)
    private Long conta;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal saldo = new BigDecimal("0.00");

    @OneToOne(mappedBy = "contaCorrente")
    @JsonIgnore
    private Usuario usuario;


}
