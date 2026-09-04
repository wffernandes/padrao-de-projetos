package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		ITGuy it = new ITGuy("Maurice Moss", 32, 5000d);
		ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);

		csvConverter.getEmployeeFormated(it);
		csvConverter.getEmployeeFormated(pm);
		jsonConverter.getEmployeeFormated(it);
		jsonConverter.getEmployeeFormated(pm);
	}
}
