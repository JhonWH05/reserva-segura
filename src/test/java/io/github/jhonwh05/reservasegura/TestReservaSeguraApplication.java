package io.github.jhonwh05.reservasegura;

import org.springframework.boot.SpringApplication;

public class TestReservaSeguraApplication {

	public static void main(String[] args) {
		SpringApplication.from(ReservaSeguraApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
