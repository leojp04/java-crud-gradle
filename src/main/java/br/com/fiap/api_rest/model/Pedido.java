package br.com.fiap.api_rest.model;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private StatusPedido status;
    private LocalDate data;
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @ManyToMany
    @JoinTable(name = "produto_pedido",
            joinColumns = @JoinColumn(name = "id_produto", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_pedido", referencedColumnName = "id"))
    private List<Produto> produtos;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
