public class CPFTeste {
	
	public static void main(String[] args) 
	{
		
		Cliente cliente = new Cliente();
		cliente.cpf = "49851482887";
		System.out.println(cliente.ehCpfValido());
	 }
}
