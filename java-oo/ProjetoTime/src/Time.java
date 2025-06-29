
public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	
	
	public Time(int hora, int minu, int segu) {
		super();
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
		
	}
	
	
	public Time(int hora, int minu) {
		super();
		this.hora = hora;
		this.minu = minu;
	}
	
	
	public Time(int hora) {
		super();
		this.hora = hora;
	}


	
	
	public Time() {
		super();
	}


	public void setTime(int hora, int minu, int segu) {
		this.hora=hora;
		this.minu=minu;
		this.segu=segu;
	}
	public void setTime(int hora, int minu) {
		this.hora=hora;
		this.minu=minu;
		this.segu=0;
	}
	public void setTime(int hora) {
		this.hora=hora;
		this.minu=0;
		this.segu=0;
	}
	
	
	
	public String exibirHoraUniversal() {
		return formataNumero(hora) + ":" + formataNumero(minu) + ":" + formataNumero(segu);
	}
	public String exibirHoraPadrao() {
		String strHora, sufixo;
		if (this.hora == 12) {
			strHora = "12";
			sufixo = "PM";
		}
		else if (this.hora == 0) {
			strHora= "12";
			sufixo = "AM";
		}
		else if (this.hora >= 1 && this.hora <=11) {
			strHora = formataNumero(hora);
			sufixo = "AM";
		}
		else {
			strHora = formataNumero(hora-12);
			sufixo = "PM";
		}
		return strHora + ":" + formataNumero(minu) + ":" + formataNumero(segu) + sufixo;
		
			
		}
	
		private String formataNumero(int numero) {
			if (numero < 10) {
				return "0" + numero;
			}
			return String.valueOf(numero);
		}
	}