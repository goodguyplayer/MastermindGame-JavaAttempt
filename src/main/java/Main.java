import models.Session;

/**
 * This class is purely meant to call the other classes in the system.
 *
 * @author Nathan (goodguyplayer)
 * @Version 0
 * @since 2021-04-15
 */

/*
Changelog.:

Version 0.1
    - Calls Session

Version 0
    - Class created
 */
public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        session.gameSession();
    }
}
