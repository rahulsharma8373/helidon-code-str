package gov.pension;

import java.io.IOException;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Application;

import io.helidon.microprofile.server.Server;

@ApplicationScoped
public class PensionRestApplication extends Application {

	public PensionRestApplication() {
	}

	public static void main(final String[] args) throws IOException {
		Server server = startServer();
		System.out.println("http://localhost:" + server.port());
	}

	static Server startServer() {
		return Server.create().start();
	}
	
}
