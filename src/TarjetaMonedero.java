
public interface TarjetaMonedero {

	public boolean comprar(float importe, String sDni);
	
	public String getId();
	
	public String getDniTitular();
	
	public float getSaldo();
	
	public void setPin(int Pin);
	
}
