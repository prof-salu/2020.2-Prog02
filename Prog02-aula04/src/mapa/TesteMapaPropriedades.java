package mapa;

import java.util.Properties;

public class TesteMapaPropriedades {

	public static void main(String[] args) {
		Properties config = new Properties();
		
		config.setProperty("usuario", "user01");
		config.setProperty("senha", "senha123");
		config.setProperty("url", "jdbc:oracle/banco");
		
		System.out.println(config.getProperty("senha"));

	}

}
