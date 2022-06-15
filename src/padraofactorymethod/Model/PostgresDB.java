/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraofactorymethod.Model;

import padraofactorymethod.Model.DB;

/**
 *
 * @author YBOTELHO
 */
public class PostgresDB extends DB {

    @Override
    public void getConnection() {
        System.out.println("Conexao com Postgres estabelecida");
    }
}
