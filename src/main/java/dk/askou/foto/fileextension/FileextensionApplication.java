package dk.askou.foto.fileextension;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.*;

@SpringBootApplication
public class FileextensionApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(FileextensionApplication.class, args);
	}

	public FileextensionApplication() {
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {


		Path path = Paths.get("/home");
		FileVisitor fileVisitor = new SimpleFileVisitorDefault();

		Files.walkFileTree(path, fileVisitor);


	}
}
