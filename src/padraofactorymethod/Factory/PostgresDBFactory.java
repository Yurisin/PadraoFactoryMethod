/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraofactorymethod.Factory;

import padraofactorymethod.Model.DB;
import padraofactorymethod.Model.PostgresDB;

/**
 *
 * @author YBOTELHO
 */
public class PostgresDBFactory extends DBFactory {

    @Override
    public DB createDB() {
        return new PostgresDB();
    }
    
}
