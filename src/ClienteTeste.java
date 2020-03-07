import java.util.Date;

public class ClienteTeste {
	public static void main(String[] args) 
	{
		Cliente cliente = new Cliente();
		
		Date nascimentoTeste = DateTimeUtils.toDate(20, 07, 2000);

		cliente.dataNascimento = nascimentoTeste;		
				
		System.out.println(cliente.dataNascimento);
		System.out.println(cliente.toString());
		
	}
}
