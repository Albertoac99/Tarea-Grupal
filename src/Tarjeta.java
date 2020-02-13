
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

}
