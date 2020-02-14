
public interface TarjetaDebito {

	public boolean retirarCajero(float importe, int Pin);
	
	public String getId();
	
	public String getDniTitular();

	public float getSaldo();
	
	public void setPin(int Pin);
}
