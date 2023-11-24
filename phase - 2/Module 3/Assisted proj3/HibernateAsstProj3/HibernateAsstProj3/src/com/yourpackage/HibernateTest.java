package com.yourpackage;

public class HibernateTest {
    public static void main(String[] args) {
        // Create Configuration instance
        Configuration config = new Configuration().configure("hibernate.cfg.xml");

        // Build SessionFactory
        SessionFactory factory = config.buildSessionFactory();

        // Open a session
        Session session = factory.openSession();

        // Perform database operations...

        // Close the session and factory
        session.close();
        factory.close();
    }
}
