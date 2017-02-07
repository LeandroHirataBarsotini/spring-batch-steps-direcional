package br.com.teste.spring_batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import br.com.teste.spring_batch.model.Relatorio;

public class ReportFieldSetMapper implements FieldSetMapper<Relatorio> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public Relatorio mapFieldSet(FieldSet fieldSet) throws BindException {

		Relatorio relatorio = new Relatorio();
		relatorio.setCodigo(fieldSet.readInt(0));
		relatorio.setVendas(fieldSet.readBigDecimal(1));
		relatorio.setQuantidade(fieldSet.readInt(2));
		relatorio.setVendedor(fieldSet.readString(3));

		// formato dd/MM/yyyy
		String date = fieldSet.readString(4);
		try {
			relatorio.setData(dateFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return relatorio;

	}

}
