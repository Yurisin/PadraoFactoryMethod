/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padraofactorymethod;

import padraofactorymethod.Factory.DBFactory;
import padraofactorymethod.Factory.OracleDBFactory;
import padraofactorymethod.Factory.PostgresDBFactory;

/**
 *
 * @author YBOTELHO
 */
public class PadraoFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBFactory OracleDBFactory = new OracleDBFactory();
        DBFactory PostgresDBFactory = new PostgresDBFactory();
        
        
    }
    
}
