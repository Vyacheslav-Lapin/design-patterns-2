package refactoring_guru.abstract_factory.example;

import refactoring_guru.abstract_factory.example.app.Application;
import refactoring_guru.abstract_factory.example.factories.MacOSFactory;
import refactoring_guru.abstract_factory.example.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        return new Application(osName.contains("mac") ? new MacOSFactory() : new WindowsFactory());
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
