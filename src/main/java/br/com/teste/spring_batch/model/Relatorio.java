package br.com.teste.spring_batch.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "registro")
public class Relatorio {
	
	private int codigo;
	
	private BigDecimal vendas;
	
	private int quantidade;
	
	private String vendedor;
	
	private Date data;

	@XmlAttribute(name = "codigo")
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@XmlElement(name = "vendas")
	public BigDecimal getVendas() {
		return vendas;
	}
	
	public void setVendas(BigDecimal vendas) {
		this.vendas = vendas;
	}
	
	@XmlElement(name = "quantidade")
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@XmlElement(name = "vendedor")
	public String getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Relatorio [codigo=" + codigo + ", vendas=" + vendas
                    + ", quantidade" + quantidade+ ", venddor=" + vendedor + "]";
	}

}
