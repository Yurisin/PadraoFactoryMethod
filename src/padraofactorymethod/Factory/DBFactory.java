/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraofactorymethod.Factory;

import padraofactorymethod.Model.DB;

/**
 *
 * @author YBOTELHO
 */
public abstract class DBFactory {
    public DB orderDB(){
        DB banco = null;
        
        banco = createDB();
        
        banco.getConnection();
        
        return banco;
    }
    protected abstract DB createDB();    
}
