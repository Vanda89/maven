package dev.fr.diginamic;

import com.github.lalyos.jfiglet.FigletFont;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Hello world!
 */
public class App {
    private static  final  Logger LOGGER =LoggerFactory.getLogger( App.class);

    public static void main(String[] args) {
     LOGGER.info("Bonjour !");
        try {
            String asciiArt = FigletFont.convertOneLine("Maven !");
            System.out.println(asciiArt);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
