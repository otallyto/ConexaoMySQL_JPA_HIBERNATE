/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otallyto.tests;

import br.com.otallyto.model.bean.Categoria;
import br.com.otallyto.connection.ConnectionFactory;
import br.com.otallyto.model.dao.CategoriaDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author Tállyto Rodrigues
 */
public class CategoriaTest {

    public static void main(String[] args) {
        
        EntityManager em = new ConnectionFactory().getConnection();

        CategoriaDAO dao = new CategoriaDAO();
 
        
        
        
        dao.remove(3);
        
        
//        for(Categoria c: dao.findAll()){
//        System.out.println("Descrição: "+c.getDescricao());
//        System.out.println("ID: "+c.getId());
//        }
        
        
//--------------------SALVAR NO BANCO DE DADOS---------------        
//        Categoria c = new Categoria();
//        c.setDescricao("Entrada");
//        c = dao.save(c);
//-----------------------------------------------------------

//--------------------ATUALIZAR POR ID-----------------------       
//        Categoria c = new Categoria();
//        c.setDescricao("Entrada");
//        c.setId(3);
//        c = dao.save(c);
//-----------------------------------------------------------

//-----------------------BUSCAR POR ID-----------------------        
//        Categoria c = dao.findByID(2);
//-----------------------------------------------------------

//-------------------------DESCRIÇÃO-------------------------
//        System.out.println("Descrição: "+c.getDescricao());
//        System.out.println("ID: "+c.getId());
//-----------------------------------------------------------
    }
}
