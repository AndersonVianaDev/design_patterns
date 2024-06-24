package org.anderson.curso_ada.creational.factory.example3;

import org.anderson.curso_ada.creational.factory.example3.factory.PostgresFactory;
import org.anderson.curso_ada.creational.factory.example3.model.DB;

public class Main {
    public static void main(String[] args) {
        DB database = new PostgresFactory().getDatabase();

        database.query("CREATE TABLE tb_users (" +
                " id uuid PRIMARY KEY," +
                "name varchar(255)," +
                "email varchar(255)" +
                ")");

        database.update("UPDATE tb_users set name = 'Anderson' where id = 2 ");
    }
}
