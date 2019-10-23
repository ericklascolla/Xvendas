/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import model.ModelProdutos;

/**
 *
 * @author Administrador
 */
public class DaoProdutos extends ConexaoMySql{
    
    public int salvarProdutosDAO (ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO TBL_PRODUTO ("
              //    + "CD_PRODUTO," comentado pois o campo é auto incremento.
                    + "NOME,"
                    + "VALOR,"
                    + "ESTOQUE)VALUES ("
                    +"'" + pModelProdutos.getProNome() + "',"
                    +"'" + pModelProdutos.getProValor()+ "',"
                    +"'" + pModelProdutos.getProEstoque()+ "'"
                );
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
}
    
}
