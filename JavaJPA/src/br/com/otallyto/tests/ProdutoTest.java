/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otallyto.tests;

import br.com.otallyto.connection.ConnectionFactory;
import br.com.otallyto.model.bean.Categoria;
import br.com.otallyto.model.bean.Produto;
import br.com.otallyto.model.dao.ProdutoDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author Tállyto Rodrigues
 */
public class ProdutoTest {
     public static void main(String[] args) {
        EntityManager em = new ConnectionFactory().getConnection();
        
         ProdutoDAO dao = new ProdutoDAO();
         
         dao.remove(1);
//         Produto produto = dao.findByID(2);
         
//for(Produto produto: dao.findAll()){
//System.out.println("Descricao: "+produto.getDescricao());
//         System.out.println("QTD: "+produto.getQtd());
//         System.out.println("Valor: "+produto.getValor());
//         System.out.println("Categoria: "+produto.getCategoria().getDescricao());
//}
         

//         Produto produto = new Produto();
//         Categoria categoria = new Categoria();
//         categoria.setId(2);
//         produto.setId();
//         produto.setDescricao("Arroz");
//         produto.setQtd(15);
//         produto.setValor(3.50);
//         produto.setCategoria(categoria);
//         
//         dao.save(produto);
    }
}
