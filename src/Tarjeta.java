
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
}
