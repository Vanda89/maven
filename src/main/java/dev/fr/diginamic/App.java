package dev.fr.diginamic;

import com.github.lalyos.jfiglet.FigletFont;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ResourceBundle;

/**
 * Hello world!
 */
public class App {
    private static  final  Logger LOGGER =LoggerFactory.getLogger( App.class);

    public static void main(String[] args) {
     LOGGER.info("Bonjour !");
        try {
            String titre = ResourceBundle.getBundle("application").getString(
                    "titre");
            String asciiArt = FigletFont.convertOneLine(titre);
            System.out.println(asciiArt);
            String environnement = ResourceBundle.getBundle("application").getString(
                    "environnement");
            System.out.println("Environnement : " + environnement);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
