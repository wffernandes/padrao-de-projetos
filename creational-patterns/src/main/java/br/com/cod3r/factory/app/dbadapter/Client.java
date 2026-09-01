package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

    public static void main(String[] args) {

        DBFactory factory = new PostgresDBFactory();

        factory.getDatabase().query("SELECT * FROM A1");
        factory.getDatabase().update("UPDATE A1 SET A1 = 'B1'");

    }
}
