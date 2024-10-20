package com.java.FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FxApplication extends Application{

	public static ConfigurableApplicationContext context;
	@Override
	public void start(Stage stage) throws Exception {
		context = SpringApplication.run(FxApplication.class);
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("/com/java/Vista/LoginVista.fxml"));
		fxml.setControllerFactory(context::getBean); //UNIFIQUER CONTROLADORES TANTO DE SPRING BOOT COMO DE JAVA FX
		Scene scene = new Scene(fxml.load());
		stage.setTitle("Libreria virtual");
		stage.setScene(scene);
		stage.show();
	}

}
