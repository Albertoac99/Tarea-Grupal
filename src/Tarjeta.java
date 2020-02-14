
public class Tarjeta {
	
    private String id;
    private String dniTitular;
    private int pin;
    private float saldo;
    
    public Tarjeta(String id, String dniTitular, int pin, float saldo) {

        setId(id);
        setDniTitular(dniTitular);
        setPin(pin);
        setSaldo(saldo);
    }
    //R y S
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDniTitular() {
		return dniTitular;
	}

	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean comprar(float importe, String sDni) {
		boolean bExito = false;

		if (sDni.equals(this.getDniTitular())) {
			if (this.getSaldo() > importe) {
				this.setSaldo(getSaldo() - importe);
				bExito = true;
			}
		}
		return bExito;
	}
	
	public boolean retirarCajero(float importe, int Pin) {
		boolean bExito = false;
		if(Pin == getPin()) {
		if (this.getSaldo() > importe) {
			this.setSaldo(getSaldo() - importe);
			bExito = true;
		}
		}
		return bExito;
	}
	
	public String toString() {
		String sResultado = "";
		
		sResultado += "Id: "+getId()+"\n";
		sResultado += "DNI: "+getDniTitular()+"\n";
		sResultado += "Pin: "+getPin()+"\n";
		sResultado += "Saldo: "+getSaldo()+"\n";
		
		return sResultado;
	}
}
