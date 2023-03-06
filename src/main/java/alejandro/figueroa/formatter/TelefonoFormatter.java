package alejandro.figueroa.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class TelefonoFormatter implements Formatter{

	@Override
	public String print(Object object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Telefono parse(String text, Locale locale) throws ParseException {
		String[] arreglo = text.split("-");
		Telefono tel = new Telefono();
		
		tel.setCodigoPais(arreglo[0]);
		tel.setLada(arreglo[1]);
		tel.setNumero(arreglo[2]);
		
		return tel;
	}

}
