
public class Data {
	private String dia, mes, ano;
	
	//comportamento
	public String getDataBr() {
		return this.dia+"/"+this.mes+"/"+this.getAno();
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
}
